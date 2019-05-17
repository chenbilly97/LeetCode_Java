/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }
        boolean isFirstSwap = true;
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null && cur.next!=null) {
            ListNode nextHead = cur.next.next;
            ListNode curTail = cur.next;
            cur.next = nextHead;
            curTail.next = cur;
            if (pre !=null) {
                pre.next = curTail;
            }
            pre = cur;
            cur = nextHead;
            if (isFirstSwap) {
                head = curTail;
                isFirstSwap = false;
            }
        }
        return head;
    }
}

