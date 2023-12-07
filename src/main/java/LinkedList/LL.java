package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    public LL() {
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            node.next = null;
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void display() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }


}

class Node {
    int val;
    Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }
}

