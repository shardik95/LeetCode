/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        head = merge (l1,l2);
        
        return head;
    }
    
    ListNode merge (ListNode l1, ListNode l2){
        
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
        ListNode L = new ListNode(-99);
        ListNode temp = L;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        
        if(l1!=null)
            temp.next = l1;
        
        if(l2!=null)
            temp.next = l2;
        
        return L.next;
        
    }
}