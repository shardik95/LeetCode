/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    class LengthAndTail{
        int length;
        ListNode tail;
        LengthAndTail(int length,ListNode tail){
            this.length = length;
            this.tail = tail;
        }
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null)
            return null;
        
        LengthAndTail lengthA = getListLength(headA);
        LengthAndTail lengthB = getListLength(headB);
        
        if(lengthA.tail.val!=lengthB.tail.val)
            return null;
        
        int diff = 0;
        if(lengthA.length>=lengthB.length){
            diff = lengthA.length-lengthB.length;
            int count =0;
            while(count!=diff && headA.next!=null){
                headA=headA.next;
                count=count+1;
            }
        }
        else{
            diff = lengthB.length-lengthA.length;
            int count =0;
            while(count!=diff && headB.next!=null){
                headB=headB.next;
                count=count+1;
            }
        }
        
        while(headA!=null){
            if(headA==headB)
                return headA;
            else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
        
    }
    
    public LengthAndTail getListLength(ListNode head){
        int length = 0;
        ListNode tail = null;
        while(head!=null){
            length = length + 1;
            tail = head;
            head=head.next;
        }
        return new LengthAndTail(length,tail);
    }
   
    
   
}