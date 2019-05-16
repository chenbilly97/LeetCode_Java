/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1!= null || l2!=null) {
            int l1Val = (l1 == null)?Integer.MAX_VALUE:l1.val;
            int l2Val = (l2 == null)?Integer.MAX_VALUE:l2.val;
            if (l1Val < l2Val) {
                cur.next = l1;
                l1 = l1.next;    
            }
            else if (l1Val >= l2Val) {
                cur.next = l2;
                l2 = l2.next;  
            }
            cur = cur.next;
        }
        return head.next;
    }
}

