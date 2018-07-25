/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode current = head;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        
        while(current!=null){
            ListNode next = current.next;
            while(temp.next!=null && temp.next.val<current.val){
                temp=temp.next;
            }
            current.next = temp.next;
            temp.next=current;
            temp = ans;
            current=next;
        }
        return ans.next;
    }
}