package LeetCode;

import java.util.List;

public class Q143_ReorderList{
    public static void main(String[] args) {
        //https://leetcode.com/problems/reorder-list/
    }

    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
         return;

        ListNode firstHead = head;
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseList(mid);

        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if (firstHead!=null) firstHead.next = null;

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