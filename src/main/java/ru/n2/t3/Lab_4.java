package ru.n2.t3;

public class Lab_4 {
    public static void main(String[] args) {
        DNode dNode = new DNode(23, null, null);
        System.out.println(toStringIter(dNode));
        add(dNode, 45);
        System.out.println(toStringIter(dNode));

    }

    private static void add(DNode dNode, int value) {
        while (dNode.right != null) {
            dNode = dNode.right;
        }

        dNode.right = new  DNode(value, dNode,null);
    }

    public static String toStringIter(DNode ref) {
        String result = "";
        while (ref != null) {
            result += "<-(" + ref.value + ")->";
            ref = ref.right;
        }
        return "null" + result + "null";
    }
}

class DNode {
     int value;
     DNode left;
     DNode right;

    public DNode(int value, DNode left, DNode rigth) {
        this.value = value;
        this.left = left;
        this.right = rigth;
    }

}
