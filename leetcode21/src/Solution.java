import org.w3c.dom.Node;

/**
 * @Auther: songyunfeng
 * @Date: 2019/1/4 10:19
 * @Description:
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
   /* public class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if(l1 == null)
                return l2;
            if(l2 == null)
                return l1;
            if(l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            } else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }*/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l = null;
        if (l1 == null) {
            return l = l2;
        }
        if (l2 == null) {
            return l = l1;
        }

        if (l1.val < l2.val) {
            l = l1;
            l.next = mergeTwoLists(l1.next, l2);
        } else {
            l = l2;
            l.next = mergeTwoLists(l1, l2.next);
        }

        return l;
    }
}