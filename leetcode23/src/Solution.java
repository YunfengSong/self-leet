/**
 * @Auther: songyunfeng
 * @Date: 2019/1/7 14:34
 * @Description:
 */

import java.util.PriorityQueue;
import java.util.Queue;


public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        Queue<ListNode> nodeList = new PriorityQueue<ListNode>(lists.length, (m, n) -> (m.val - n.val));

        for (ListNode l : lists) {
            if (l != null) {
                nodeList.add(l);
            }
        }

        ListNode node = new ListNode(0);
        ListNode last = node;
        while (!nodeList.isEmpty()) {
            last.next = nodeList.poll();
            last = last.next;
            if (last.next != null)
                nodeList.add(last.next);
        }
        return node.next;
    }
}