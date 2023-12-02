package LeetCode;

public class Q141_LinkedListCycle {
    //https://leetcode.com/problems/linked-list-cycle/description/
    public static void main(String[] args) {
       // revision saurabh revision
    }
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }

}
