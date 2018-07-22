/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(fast!=null && fast.next!=null){
            stack.push(slow.val);
            fast=fast.next.next;
            slow=slow.next;
        }
        
        if(fast!=null)
            slow=slow.next;
        
        while(slow!=null){
            if(slow.val!=stack.pop())
                return false;
            slow=slow.next;
        }
        return true;
        
    }
    
}