package LinkedList;

public class DLL {

    private Node head;
    private Node tail;

    public DLL() {
    }

    public DLL(Node head) {
        this.head = head;
    }

    public DLL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        node.next = null;

        if (head == null) {
            node.previous = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = node;
        node.previous = last;
        tail = node;
    }

    public void insert(int after, int val){}

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null)
            head.previous = node;

        head = node;

    }


    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }

        System.out.println("End");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.previous;
        }

        System.out.println(" Start ");
    }


    private class Node {
        private int val;
        private Node next;
        private Node previous;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }

    }
}
