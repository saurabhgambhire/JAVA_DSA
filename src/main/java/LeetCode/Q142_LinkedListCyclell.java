package LeetCode;

public class Q142_LinkedListCyclell {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {

        int length = 0;

        // take two pointers

        ListNode fast = head;
        ListNode slow = head;

        // find the length of Cycle

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                length = lengthCycle(fast);
                break;
            }
        }

        if(length == 0)
            return null;

        // find the starting node of Cycle

        ListNode f = head;
        ListNode s = head;

        while(length > 0)
        {
            s = s.next;
            length--;
        }

        // keep moving both the pointers they will meet at start

        while(f!=s)
        {
            f = f.next;
            s = s.next;
        }

        return s;

    }

    public int lengthCycle(ListNode node)
    {
        int length = 0;
        ListNode temp = node;
        do{
            temp = temp.next;
            length++;
        }while(temp!=node);
        return length;
    }
}
