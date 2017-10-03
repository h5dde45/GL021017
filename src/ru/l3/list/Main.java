package ru.l3.list;

public class Main {
    public static void main(String[] args) {
//        DinamicArray dinamicArray=new DinamicArray();
//
//        System.out.println(dinamicArray);
//        dinamicArray.add(11);
//        dinamicArray.add(12);
//        dinamicArray.add(14);
//        dinamicArray.add(15);
//        dinamicArray.add(1,13);
//        System.out.println(dinamicArray);
//        dinamicArray.remove();
//        System.out.println(dinamicArray);
//        dinamicArray.remove(2);
//        System.out.println(dinamicArray);
//
//        Node node_0=new Node(0,null);
//        Node node_1=new Node(1,null);
//        Node node_2=new Node(2,null);
//        Node node_3=new Node(3,null);
//
//        node_0.next=node_1;
//        node_1.next=node_2;
//        node_2.next=node_3;
//
//        Node ref=node_0;
//
//        while (ref!=null){
//            System.out.print(" "+ref.value);
//            ref=ref.next;
//        }

//        Node node_3=new Node(3,null);
//        Node node_2=new Node(2,node_3);
//        Node node_1=new Node(1,node_2);
//        Node node_0=new Node(0,node_1);

//        Node node_0=new Node(0,new Node(1,new Node(2,new Node(3,null))));
//        Node node_0=node(0,node(1,node(2, node(3,null))));
        Node tail = null;

        for (int i = 0; i < 10; i++) {
            tail = new Node(i, tail);
        }

        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

//        Node ref=tail;
//
//        while (ref!=null){
//            System.out.print(" "+ref.value);
//            ref=ref.next;
//        }


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


//    private static Node node(int value,Node next) {
//        return new Node(value,next);
//    }

}
