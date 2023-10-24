package LeetCode;

public class Q148_SortList {
    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode mid = middleNode(head);
        ListNode right = sortList(mid);
        ListNode left = sortList(head);
        return merge(left, right);
    }

    public ListNode merge(ListNode list1, ListNode list2)
    {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1!= null && list2 != null)
        {
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode midPrev = null;
        while(head != null && head.next != null)
        {
            midPrev = ( midPrev == null) ? head : midPrev.next;
            head =  head.next.next;
        }

        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
