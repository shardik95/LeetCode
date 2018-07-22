/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head,temp = null;
        if(l1.val<l2.val){
            ListNode node = new ListNode(l1.val);
            head = node;
            temp = node;
            l1=l1.next;
        }
        else{
            ListNode node = new ListNode(l2.val);
            head = node;
            temp = node;
            l2=l2.next;
        }
        while(l1!=null && l2!=null){
            ListNode node = null;
            if(l1.val<l2.val){
                node = new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                node = new ListNode(l2.val);
                l2=l2.next;
             }
            temp.next = node;
            temp = node;
        }
        while(l1!=null){
            ListNode node = new ListNode(l1.val);
            temp.next = node;
            l1 = l1.next;
            temp = node;
        }
        while(l2!=null){
            ListNode node = new ListNode(l2.val);
            temp.next = node;
            l2 = l2.next;
            temp = node;
        }
        return head;
    }
    
}