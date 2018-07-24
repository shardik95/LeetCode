/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        while(fast!=null&&fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        if(temp!=null)
            temp.next = null;
        else head=null;
        
        TreeNode r =new TreeNode(slow.val);
        r.right = sortedListToBST(slow.next);
        r.left = sortedListToBST(head);
        
        return r;
    }
}