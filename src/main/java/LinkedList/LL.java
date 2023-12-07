package LinkedList;

public class LL {
    private Node head;
    private Node tail;

    public LL() {
    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
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

