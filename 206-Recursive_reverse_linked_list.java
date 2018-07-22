/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
         return reverseListHelper(head,null);
    }
    
    private ListNode reverseListHelper(ListNode head,ListNode prev){
        
        if(head == null){
            return head;
        }
        
        if(head.next == null){
            head.next = prev;
            return head;
        }
        
        ListNode current = head;
        ListNode next = current.next;
        
        current.next = prev;
        prev = current; 
        current = next;
        head = current;
        head = reverseListHelper(head,prev);
        
        return head;
        
    }
}