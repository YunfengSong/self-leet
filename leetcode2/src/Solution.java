/**
 * @Auther: songyunfeng
 * @Date: 2018/12/30 14:25
 * @Description:
 */
public class Solution {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

    public ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int carry = 0;
        ListNode lResult  = new ListNode(0);
        ListNode lPointer  = lResult;

        while (l1 != null || l2 != null){
            int n1 = 0 , n2 = 0;

            if (l1 != null){
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                n2 = l2.val;
                l2 = l2.next;
            }

            int temp = n1 + n2 + carry;
            carry = temp / 10;
            temp = temp % 10;

            lPointer.next = new ListNode(temp);
            lPointer = lPointer.next;
        }
        if (carry > 0 ){
            lPointer.next = new ListNode(carry);
        }
        return lPointer.next;
    }
}
