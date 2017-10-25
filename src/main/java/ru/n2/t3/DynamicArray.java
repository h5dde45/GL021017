package ru.n2.t3;

import static java.lang.System.arraycopy;

class DynamicArray {

    int[] data = {};


    public void add(int elem) {
        add(data.length, elem);
    }

    public void add(int i, int elem) {
        int[] temp = new int[data.length + 1];
        arraycopy(data, 0, temp, 0, i );
        arraycopy(data, i , temp, i + 1, data.length-i);
        temp[i] = elem;
        data = temp;

    }

    public void remove() {
        remove(data.length - 1);
    }

    public void remove(int i) {
        int[] temp = new int[data.length - 1];
        arraycopy(data, 0, temp, 0, i );
        arraycopy(data, i+1 , temp, i , data.length-i-1);
        data = temp;
    }
}
