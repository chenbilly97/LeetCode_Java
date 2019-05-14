/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode firstNode = dummy;
        ListNode secondNode = dummy;
        dummy.next = head;
        
        for (int i=1;i<=n+1;i++) {
            firstNode = firstNode.next;
        }
        
        while (firstNode!=null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        secondNode.next = secondNode.next.next; 
        return dummy.next;
    }
}

