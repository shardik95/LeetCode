/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        
        ListNode odd = head;
        ListNode even = head.next;
        
        ListNode temp_odd = odd;
        ListNode temp_even = even;
        
        while(head.next!=null && head.next.next!=null){
            head=head.next.next;
            temp_odd.next = head;
            temp_even.next = head.next;
            temp_odd = head;
            temp_even = head.next;
        }
        temp_odd.next = even;
        return odd;
        
    }
}