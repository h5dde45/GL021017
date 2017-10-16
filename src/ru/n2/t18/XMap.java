package ru.n2.t18;

public interface XMap<K, V> {
    public void put(K key, V value);

    public V get(K key);

    public boolean containsKey(K key);

    public void remove(K key);

}
