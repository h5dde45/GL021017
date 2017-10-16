package ru.n2.t16.iterable;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] data;
    private int index=0;

    public ArrayIterator(T[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index<data.length;
    }

    @Override
    public T next() {
        return data[index++];
    }
}
