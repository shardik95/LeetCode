/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode beforeStart = new ListNode(-1);
        ListNode beforeEnd = beforeStart;
        
        ListNode afterStart = new ListNode(-1);
        ListNode afterEnd = afterStart;
        
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                beforeEnd.next = temp;
                beforeEnd = beforeEnd.next;
                
            }
            else{
                afterEnd.next = temp;
                afterEnd = afterEnd.next;
            }
            temp=temp.next;
        }
        
        beforeEnd.next = null;
        afterEnd.next = null;
        
        if(beforeEnd.val == -1)
            return afterStart.next;
        
        beforeEnd.next = afterStart.next;
        
        return beforeStart.next;
        
    }
}