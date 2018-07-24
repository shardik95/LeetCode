/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1= new Stack<>();
        Stack<Integer> s2= new Stack<>();
        
        ListNode l1_temp=l1;
        ListNode l2_temp=l2;
        
        while(l1_temp!=null){
            s1.push(l1_temp.val);
            l1_temp=l1_temp.next;
        }
        
        while(l2_temp!=null){
            s2.push(l2_temp.val);
            l2_temp=l2_temp.next;
        }
        Stack<Integer> s3=new Stack<>();
        int carry=0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int result=0;
            if(!s1.isEmpty())
                result=result+s1.pop();
            if(!s2.isEmpty())
                result=result+s2.pop();
            result = result + carry;
            if(result>9)
                carry = 1;
            else
                carry = 0;
            s3.push(result%10);
        }
        if(carry!=0)
            s3.push(carry);
        
        
        ListNode ans=null;
        ListNode prev=null;
        while(!s3.isEmpty()){
            ListNode n = new ListNode(s3.pop());
            if(ans==null){
                ans=n;
                prev=ans;
            }
            else{
                prev.next = n;
                prev = n;
            }
        }
        return ans;
    
    }
}