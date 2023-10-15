package LinkedList;


import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.addLast(100);
        dll.addFirst(50);
        dll.addFirst(60);

        dll.display();
    }
}
