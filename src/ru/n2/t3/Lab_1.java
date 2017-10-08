package ru.n2.t3;

public class Lab_1 {
    public static void main(String[] args) {
        int[] arr = {23, 5, 87, 7, 55, 3, 7, 51, 234, 6, 98};
        Node tail = generateIter(arr);

        System.out.println(toStringRec(tail));
        System.out.println(toStringIter(tail));
        System.out.println("Size (rec) : " + sizeRec(tail));
        System.out.println("Size (iter) : " + sizeIter(tail));
        System.out.println("Sum (rec) : " + sumRec(tail));
        System.out.println("Sum (iter) : " + sumIter(tail));
        System.out.println("Max (rec) : " + maxRec(tail));
        System.out.println("Max (iter) : " + maxIter(tail));

    }

    private static int maxRec(Node tail) {
        if (tail.next == null) {
            return tail.value;
        } else {
            int tmp = maxRec(tail.next);
            if (tail.value > tmp) {
                return tail.value;
            } else {
                return tmp;
            }
        }
    }

    private static int maxIter(Node tail) {
        int max = tail.value;
        tail = tail.next;
        while (tail != null) {
            if (max < tail.value){
                max=tail.value;
            }
            tail = tail.next;
        }
        return max;
    }

    private static int sumIter(Node tail) {
        int sum = 0;
        while (tail != null) {
            sum+=tail.value;
            tail = tail.next;
        }
        return sum;
    }

    private static int sumRec(Node tail) {
        int sum = 0;
        if (tail == null) {
            return sum;
        } else {
            sum=tail.value;
            sum += sumRec(tail.next);
        }
        return sum;
    }

    private static int sizeIter(Node tail) {
        int count = 0;
        while (tail != null) {
            count++;
            tail = tail.next;
        }
        return count;
    }

    private static int sizeRec(Node tail) {
        int count = 0;
        if (tail == null) {
            return count;
        } else {
            count++;
            count += sizeRec(tail.next);
        }
        return count;
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
