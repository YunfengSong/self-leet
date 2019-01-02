



public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }

        int i = 0;
        ListNode p1 = head, p2 = head;

        while(p1.next != null) {
            p1 = p1.next;
            ++i;

            if(i > n) {
                p2 = p2.next;
            }
        }

        if(i == n - 1) {
            head = head.next;
        } else {
            p2.next = p2.next.next;
        }
        return head;
    }





}


