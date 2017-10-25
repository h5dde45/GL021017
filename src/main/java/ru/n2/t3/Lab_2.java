package ru.n2.t3;

public class Lab_2 {
    public static void main(String[] args) {

        int[] arr = {23, 5, 87, 7, 55, 3, 7, 51, 234, 6, 98};
        Node tail = generateIter(arr);

        System.out.println(toStringRec(tail));

        add(tail, 34);
        System.out.println(toStringIter(tail));
        add(tail, 4, 77);
        System.out.println(toStringIter(tail));
        remove(tail);
        System.out.println(toStringIter(tail));
        remove(tail, 10);
        System.out.println(toStringIter(tail));

    }

    private static void remove(Node tail, int index) {
        int count = 0;

        if (index == 0) {
            Node tmp = tail.next;
            tail.value = tmp.value;
            tail.next = tmp;
        } else {
            while (tail.next != null && count != (index - 1)) {
                tail = tail.next;
                count++;
            }
            Node tmp = tail.next;
            tail.next = tmp.next;
        }
    }

    private static void remove(Node tail) {
        Node prev = tail;

        while (tail.next != null) {
            prev = tail;
            tail = tail.next;
        }
        prev.next = null;
    }

    private static void add(Node tail, int index, int value) {
        int count = 0;

        if (index == 0) {
            Node tmp = new Node(tail.value, tail.next);
            tail.value = value;
            tail.next = tmp;
        } else {
            while (tail.next != null && count != (index - 1)) {
                tail = tail.next;
                count++;
            }
            Node tmp = new Node(value, tail.next);
            tail.next = tmp;
        }
    }

    private static void add(Node tail, int value) {
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(value, null);
    }

    private static Node generateIter(int[] arr) {
        Node result = null;
        for (int i = 0; i < arr.length; i++) {
            result = new Node(arr[i], result);
        }

        return result;
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
