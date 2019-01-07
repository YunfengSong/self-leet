


public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode p = head;
        System.out.println(p);

        if(p == null || p.next == null)
            return head;

        ListNode newHead = p.next;
        p.next = p.next.next;
        newHead.next = p;
        p = newHead.next.next;
        newHead.next.next = swapPairs(p);
        return newHead;
    }


}
