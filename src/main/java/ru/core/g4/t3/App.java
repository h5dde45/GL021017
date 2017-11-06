package ru.core.g4.t3;


import static java.util.Arrays.copyOfRange;

public class App {
    public static void main(String[] args) {
        Node tail0 = genRec(11, 22, 32, 45);
        System.out.println(toStringRec(tail0));

        Node tail1 = genRec(10, 11, 12, 23, 56, 78);
        System.out.println(toStringIter(tail1));

        System.out.println(toStringIter(merge(tail0, tail1)));

//        Object o=new long[Integer.MAX_VALUE];

    }

    private static Node merge(Node tail0, Node tail1) {
        if (tail0 != null && tail1 != null) {
            if (tail0.value < tail1.value) {
                return new Node(tail0.value, merge(tail0.next, tail1));
            } else {
                return new Node(tail1.value, merge(tail0, tail1.next));
            }
        } else
            return tail0 == null ? tail1 : tail0;
    }

    private static String toStringRec(Node tail1) {
        return tail1 == null ? "null" : tail1.value + " -> " + toStringRec(tail1.next);
    }

    private static String toStringIter(Node tail1) {
        String s = "";
        while (tail1 != null) {
            s += tail1.value + " -> ";
            tail1 = tail1.next;
        }
        return s + "null";
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