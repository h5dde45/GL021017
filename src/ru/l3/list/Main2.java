package ru.l3.list;

public class Main2 {
    public static void main(String[] args) {
        Node tailI0 = generateIter0(9);
        Node tailR0 = generateRec0(9);
        Node tailI1 = generateIter1(9);
        Node tailR1 = new Node(9, null);
        generateRec1(tailR1);

        System.out.println(toStringIter(tailI0));
        System.out.println(toStringIter(tailI1));
        System.out.println(toStringIter(tailR0));
        System.out.println(toStringIter(tailR1));

        System.out.println(toStringRec(tailI0));
        System.out.println(toStringRec(tailI1));
        System.out.println(toStringRec(tailR0));
        System.out.println(toStringRec(tailR1));
    }

    private static Node generateIter0(int max) {
        Node result = null;
        for (int i = 0; i <= max; i++) {
            result = new Node(i, result);
        }
        return result;
    }

    private static Node generateRec0(int value) {
        if (value >= 0) {
            return new Node(value, generateRec0(value - 1));
        } else {
            return null;
        }
    }

    private static Node generateIter1(int max) {
        Node tail = new Node(max, null);
        Node head = tail;
        for (int i = max; i > 0; i--) {
            head.next = new Node(i - 1, null);
            head = head.next;
        }
        return tail;
    }

    private static Node generateRec1(Node node) {
        if (node.value > 0) {
            node.next = new Node(node.value - 1, null);
            generateRec1(node.next);
        }
        return null;
    }
    public static String toStringIter(Node ref) {
        String result = "";

        while (ref != null) {
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        result += null;

        return result;
    }

    public static String toStringRec(Node ref) {
        if (ref == null) {
            return "null";
        } else {
            return "(" + ref.value + ")->" + toStringRec(ref.next);
        }
    }
}
