package Mca1_Sem1;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class CountNumberOfNodes {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.add(10);
        sll.add(20);
        sll.add(30);

        sll.print();


    }

}

class SLL {
    Node head;

    public SLL() {
    }


    public void print() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public void add(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }


    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }

}

