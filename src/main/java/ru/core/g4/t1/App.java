package ru.core.g4.t1;

import static java.util.Arrays.copyOfRange;

public class App {
    public static void main(String[] args) {
//        Node tail;
//        Node node0 = new Node(0, null);
//        Node node1 = new Node(1, null);
//        Node node2 = new Node(2, null);
//        Node node3 = new Node(3, null);
//
//        tail=node3;
//        node3.next=node2;
//        node2.next=node1;
//        node1.next=node0;
//        Node tail;
//        tail = new Node(0, null);
//        tail = new Node(1, tail);
//        tail = new Node(2, tail);
//        tail = new Node(3, tail);
//
//        int[] a={1,2,3,4};
//        int i=0;
//        a[i++]=
//        a[++i];
//        System.out.println(Arrays.toString(a));

        Node tail0=genIter(0,1,2,3);
        System.out.println(toStringRec(tail0));

        Node tail1 = genRec(0, 1, 2, 3);
        System.out.println(toStringIter(tail1));

    }

    private static String toStringRec(Node tail1) {
        return tail1==null?"null":tail1.value+" -> "+toStringRec(tail1.next);
    }

    private static String toStringIter(Node tail1) {
        String s="";
        while (tail1!=null){
            s+=tail1.value+" -> ";
            tail1=tail1.next;
        }
        return s+"null";
    }

    private static Node genRec(int... values) {
        return values.length == 0 ? null : new Node(values[0],
                genRec(copyOfRange(values, 1, values.length)));
    }

    private static Node genIter(int... values) {
        Node tail = null;
        for (int j : values) {
            tail = new Node(j, tail);
        }
        return tail;
    }
}

class Node {
    int value;
    Node next;

    public Node(int value, Node next) {
        this.next = next;
        this.value = value;
    }
}