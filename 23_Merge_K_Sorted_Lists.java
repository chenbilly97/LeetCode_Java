/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (ListNode node: lists) {
            while (node != null){
                int val = node.val;
                if (map.get(val) == null){
                    map.put(val,1);
                }
                else {
                    map.put(val,map.get(val)+1);
                }
                node = node.next;
            }
        }
        List<Integer> numByKey = new ArrayList<>(map.keySet());
        Collections.sort(numByKey);
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int num : numByKey) {
            int freq = map.get(num);
            for (int i=1;i<=freq;i++) {
                cur.next = new ListNode(num);
                cur = cur.next;
            }
        }
        return head.next;
    }
}

