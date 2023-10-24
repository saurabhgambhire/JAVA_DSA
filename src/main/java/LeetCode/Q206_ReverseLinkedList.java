package LeetCode;

public class Q206_ReverseLinkedList {
    public static void main(String[] args) {
    //https://leetcode.com/problems/reverse-linked-list/
    }
    public ListNode reverseList(ListNode head) {

        if(head == null)
            return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode nx = present.next;

        while( present != null )
        {
            present.next = prev;
            prev = present;
            present = nx;
            if(nx != null){
                nx = nx.next;
            }
        }
        return prev;
    }
}
