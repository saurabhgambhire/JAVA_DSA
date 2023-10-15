package LinkedList;


import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
//        DLL dll = new DLL();
//        dll.addFirst(20);
//        dll.addFirst(30);
//        dll.addFirst(40);
//        dll.addLast(100);
//        dll.addFirst(50);
//        dll.addFirst(60);
//        dll.display();


        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);
        list.delete(60);
        list.display();
    }
}
