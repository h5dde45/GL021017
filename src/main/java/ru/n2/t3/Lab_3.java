package ru.n2.t3;

public class Lab_3 {

    public static void main(String[] args) {

        TNode tn_5 = new TNode(5, null, null);
        TNode tn_9 = new TNode(9, null, null);
        TNode tn_31 = new TNode(31, null, null);
        TNode tn_68 = new TNode(68, null, null);
        TNode tn_27 = new TNode(27, null, tn_5);
        TNode tn_17 = new TNode(17, tn_9, tn_27);
        TNode tn_3 = new TNode(3, tn_31, tn_68);
        TNode tn_41 = new TNode(41, tn_17, tn_3);

        System.out.println(size(tn_41));
//        System.out.println(height(tn_41));

    }

//    private static int height(TNode tn) {
//        int count = 0;
//        if (tn != null) {
//            count++;
//            count += height(tn.getLeft()) + height(tn.getRight());
//        }
//
//        return count;
//    }

    private static int size(TNode tn) {
        int count = 0;
        if (tn != null) {
            count++;
            count += size(tn.getLeft()) + size(tn.getRight());
        }
        return count;
    }
}

class TNode {
    private int value;
    private TNode left;
    private TNode right;

    public TNode(int value, TNode left, TNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TNode getLeft() {
        return left;
    }

    public void setLeft(TNode left) {
        this.left = left;
    }

    public TNode getRight() {
        return right;
    }

    public void setRight(TNode right) {
        this.right = right;
    }
}