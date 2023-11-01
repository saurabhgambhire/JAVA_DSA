package LeetCode;

public class Q61_RotateList {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;

        ListNode last = head;
        int length = 1;
        while (last.next != null) {
            last = last.next;
            length++;
        }

        last.next = head;
        int rotations = k % length;
        int skips = length - rotations;

        ListNode newLast = head;
        for (int i = 0; i < skips - 1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }
}
