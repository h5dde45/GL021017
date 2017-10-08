package ru.n2.t3;

public class SingleLinkedListTest {
    public static void main(String[] args) {
        Node tailI1 = generateIter1(9);
        Node tailI2 = generateIter2(9);
        Node tailR1 = generateRec1(9);
        Node tailR2 = new Node(9, null);
        generateRec2(tailR2);

        System.out.println(toStringRec(tailI1));
        System.out.println(toStringIter(tailI1));
        System.out.println(toStringRec(tailI2));
        System.out.println(toStringIter(tailI2));
        System.out.println(toStringRec(tailR1));
        System.out.println(toStringIter(tailR1));
        System.out.println(toStringRec(tailR2));
        System.out.println(toStringIter(tailR2));

    }

    private static void generateRec2(Node node) {
        if (node.value > 0) {
            node.next = new Node(node.value - 1, null);
            generateRec2(node.next);
        }
    }


    private static Node generateIter1(int max) {
        Node result = null;
        for (int i = 0; i <= max; i++) {
            result = new Node(i, result);
        }

        return result;
    }

    private static Node generateIter2(int max) {
        Node result = new Node(max, null);
        Node head = result;
        for (int i = max; i > 0; i--) {
            head.next = new Node(i - 1, null);
            head = head.next;
        }
        return result;
    }

    private static Node generateRec1(int max) {
        if (max >= 0) {
            return new Node(max, generateRec1(max - 1));
        } else {
            return null;
        }
    }

    public static String toStringRec(Node ref) {
        if (ref == null) {
            return "null";
        } else {
            return "(" + ref.value + ")->" + toStringRec(ref.next);
        }
    }

    public static String toStringIter(Node ref) {
        String result = "";
        while (ref != null) {
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        return result + "null";
    }


}
