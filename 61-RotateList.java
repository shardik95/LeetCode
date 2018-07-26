/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode tail = null;
        ListNode prev = head;
        ListNode temp = head;
        int length = 0;
        
        while(temp!=null){
            prev = temp;
            length = length+1;
            temp = temp.next;
        }
        
        if(k==length)
            return head;
        
        tail = prev;
        k = k%length;
        int c = 1;
        temp=head;
        while(temp!=null && c!=length-k){
            temp = temp.next;
            c=c+1;
        }
       
        tail.next = head;
        head = temp.next;
        temp.next = null;
        return head;
        
    }
}