/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);


        for(ListNode list : lists){
            pq.add(list);
        }

        while(!pq.isEmpty()){

            ListNode curr = pq.poll();

            ans.next = curr;
            if(curr.next!=null)pq.add(curr.next);
            ans = ans.next;
        }
        return dummy.next;
    }
}
