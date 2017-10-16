package ru.n2.t18;

import static java.util.Map.*;

public class XHashMap<K, V> implements XMap {
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
    public void put(Object key, Object value) {

    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public void remove(Object key) {

    }
}
