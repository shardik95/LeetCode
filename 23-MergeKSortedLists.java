/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==1)
            return lists[0];
        if(lists.length==0)
            return null;
        
        ListNode head = lists[0];
        
        for(int i=1;i<lists.length;i++){
            head = merge(head,lists[i]);
        }
        
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