package ru.n2.t18;

//import static java.util.Map.*;

public class XHashMap<K, V> implements XMap<K, V> {
    private final static int DEFAULT_INITIAL_CAPACITY = 16;
    private final static float DEFAULT_LOAD_FACTOR = 0.75F;

    private final float loadFactor;
    private Entry<K, V>[] table;
    private int size = 0;

    public XHashMap() {
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
    }

    public XHashMap(int defaultInitialCapacity, float defaultLoadFactor) {
        this.loadFactor = defaultLoadFactor;
        this.table = new Entry[defaultInitialCapacity];
    }


    @Override
    public void put(K key, V value) {
        int backedIndex=Math.abs(key.hashCode())%table.length;
        Entry<K,V> currentEntry=table[backedIndex];
        table[backedIndex]= new Entry<>(key, value, currentEntry);
        size++;
        if(size*loadFactor>table.length){
            Entry<K,V>[] newTable=new Entry[table.length*2];
            transfer(this.table,newTable);
        }
    }

    private void transfer(Entry<K, V>[] table, Entry<K, V>[] newTable) {
        for(int oldBucketIndex=0;oldBucketIndex<table.length;oldBucketIndex++){
            Entry<K,V> oldEntry=table[oldBucketIndex];
            while (oldEntry!=null){
                K key=oldEntry.key;
                V value=oldEntry.value;
                int newBucketIndex=key.hashCode()%newTable.length;
                Entry<K,V> newEntry=table[newBucketIndex];
                    newTable[newBucketIndex]=new Entry<>(key,value,newEntry);
            }
        }
    }

    @Override
    public V get(K key) {
        int bucketIndex=Math.abs(key.hashCode())%table.length;
        Entry<K,V> entry=table[bucketIndex];
        while (entry!=null){
            if (key.equals(entry.key)){
                return entry.value;
            }
            entry= entry.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return get(key)!=null;
    }

    @Override
    public void remove(Object key) {

    }

    private static class Entry<K0, V0> {
        final K0 key;
        V0 value;
        Entry<K0,V0> next;

        public Entry(K0 key, V0 value, Entry<K0, V0> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
