/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //create cloned copy next to each pointer 
        //after that link each node pointer to there random next 
        //link the nodes 
if(head==null)return null;
        Node curr = head;


        while(curr!=null){
            Node next = curr.next;
            Node copy = new Node(curr.val);
            curr.next = copy;
            copy.next = next;
            curr = next;
        }

        curr = head;
        Node clone = head.next;

        while(curr!=null){
            curr.next.random = curr.random!=null ? curr.random.next : null;
            curr = curr.next.next;
        }

        curr = head;
       Node cloneHead = head.next;

       while(curr!=null){

         Node copy = curr.next;
         curr.next = copy.next;

         if(copy.next!=null){
            copy.next = copy.next.next;
         }
         curr = curr.next;
       }
       return cloneHead;





    }
}
