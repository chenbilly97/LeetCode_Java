/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        ListNode node = null;
        int carry = 0, l1Value = 0, l2Value = 0;
        while (l1!=null || l2!=null)
        {
            l1Value = (l1 == null) ? 0 : l1.val;
            l2Value = l2 == null ? 0 : l2.val;
            int digit = (l1Value + l2Value + carry) % 10;
            carry = (l1Value + l2Value + carry) / 10;
            node = new ListNode(digit);
            current.next = node;
            current = node;
            l1 = (l1 == null)?l1:l1.next;
            l2 = (l2 == null)?l2:l2.next;
        }
        if (carry != 0)
        {
            node = new ListNode(carry);
            current.next = node;
            current = node;
        }
        return head.next;
    }
}