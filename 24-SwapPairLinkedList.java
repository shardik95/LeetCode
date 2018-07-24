/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode ans = new ListNode(-1);
        ListNode follow = ans;
        while(head!=null && head.next!=null){
            ListNode temp = head.next.next;
            ListNode next = head.next;
            next.next = head;
            head.next = temp;
            follow.next = next;
            follow = next.next;
            head = temp;
        }
        return ans.next;
        
    }
}