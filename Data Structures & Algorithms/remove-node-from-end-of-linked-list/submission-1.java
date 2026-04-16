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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = head;
        ListNode second = head;

        while(n>0 && first!=null){
            first = first.next;
            n--;
        }
        if(first==null)return head.next;
        while(first!=null && first.next!=null){
            first = first.next;
            second = second.next;
        }
        ListNode next = second.next.next;
        second.next = next;
        return head;
    }
}
