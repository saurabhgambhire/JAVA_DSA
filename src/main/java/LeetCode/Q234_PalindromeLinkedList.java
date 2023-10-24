package LeetCode;

public class Q234_PalindromeLinkedList {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond = reverseList(mid);
        ListNode rereversHead = headsecond;
        // campare both the half
        while (head != null && headsecond != null) {
            if (head.val != headsecond.val)
                break;

            head = head.next;
            headsecond = headsecond.next;
        }
        reverseList(rereversHead);
        return  (head == null || headsecond == null);
    }

    public ListNode reverseList(ListNode head) {

        if (head == null)
            return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode nx = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = nx;
            if (nx != null) {
                nx = nx.next;
            }
        }
        return prev;
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
