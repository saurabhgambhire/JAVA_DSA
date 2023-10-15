package LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
    }

    public CircularLinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }


    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        do {
            System.out.print(node.val + " -> ");
            node = node.next;
        } while (node != head);
    }

    private static class Node {
        int val;
        Node next;

        public Node() {
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}
