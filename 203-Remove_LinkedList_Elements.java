/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
           return head;
        while(head.val==val){
            if(head.next!=null)
                head=head.next;
            else 
                return null;
        }
        ListNode current=head;
        ListNode prev=null;
        while(current.next!=null){
            if(current.next.val==val){
               current.next=current.next.next;
            }
            else current=current.next;
        }
        if(current.val==val)
            current=null;
        return head;
    }
}