package ru.l3.list;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class DinamicArray {
    int[] data={};

    void add(int elem){
        add(data.length,elem);
    }
    void remove(){
        remove(data.length-1);
    }

    void remove(int index) {
        int[] tmp=new int[data.length-1];
        arraycopy(data,0,tmp,0,index);
        arraycopy(data,index+1,tmp,index,data.length-index-1);
        data=tmp;
    }

    void add(int index, int elem) {
        int[] tmp=new int[data.length+1];
        arraycopy(data,0,tmp,0,index);
        arraycopy(data,index,tmp,index+1,data.length-index);
        tmp[index]=elem;
        data=tmp;
    }

    @Override
    public String toString() {
        return "DinamicArray{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
