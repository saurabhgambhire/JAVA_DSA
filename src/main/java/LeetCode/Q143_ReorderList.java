package LeetCode;

import java.util.List;

public class Q143_ReorderList{
    public static void main(String[] args) {
        //https://leetcode.com/problems/reorder-list/
    }

    public void reorderList(ListNode head) {
        if(head.next == null || head == null)
        return;

        ListNode firstHead = head;
        ListNode mid = mid(head);
        ListNode secondHead = reversListNode(mid);

        while (firstHead != null && secondHead != null) {
            ListNode temp = firstHead.next;
            firstHead.next = secondHead;
            firstHead = temp;

            temp = secondHead.next;
            secondHead.next = firstHead;
            secondHead = temp;
        }

        if (firstHead.next != null) {
            firstHead.next = null;
        }
    }

    public ListNode mid(ListNode head){
        
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reversListNode(ListNode head){
        if(head == null)
        return head;

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(prev != null)
        {
            present.next = prev;
            prev = present;
            present = next;
            if(next !=null){
                next = next.next;
            }
        }

        return prev;
    }
    
}