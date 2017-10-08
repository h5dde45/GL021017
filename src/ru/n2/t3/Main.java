package ru.n2.t3;

public class Main {
    public static void main(String[] args) {

//        DynamicArray dynamicArray=new DynamicArray();
//        System.out.println(Arrays.toString(dynamicArray.data));
//
//        dynamicArray.add(10);
//        dynamicArray.add(20);
//        dynamicArray.add(30);
//        dynamicArray.add(40);
//        dynamicArray.add(50);
//        System.out.println(Arrays.toString(dynamicArray.data));
//
//        dynamicArray.remove();
//        System.out.println(Arrays.toString(dynamicArray.data));
//
//        dynamicArray.remove(2);
//        System.out.println(Arrays.toString(dynamicArray.data));
//
//        dynamicArray.add(1,45);
//        System.out.println(Arrays.toString(dynamicArray.data));

//        Node node0=new Node(0,null);
//        Node node1=new Node(1,null);
//        Node node2=new Node(2,null);
//        Node node3=new Node(3,null);
//
//        node0.next=node1;
//        node1.next=node2;
//        node2.next=node3;
//        Node node3 = new Node(3, null);
//        Node node2 = new Node(2, node3);
//        Node node1 = new Node(1, node2);
//        Node node0 = new Node(0, node1);

//        Node node0=new Node(0,new Node(1,new Node(2,new Node(3,null))));

        Node tail = null;

        for (int i = 0; i < 10; i++) {
            tail = new Node(i, tail);
        }

        System.out.println(toStringIter(tail));
        System.out.println(toStringRec(tail));

    }

    public static String toStringIter(Node ref) {
        String result = "";
        while (ref != null) {
            result += "(" + ref.value+")->";
            ref = ref.next;
        }
        return result+"null";
    }

    public static String toStringRec(Node ref) {
        if(ref==null){
            return "null";
        }else {
            return "(" + ref.value+")->"+toStringRec(ref.next);
        }
    }
}
