**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i:G){
            set.add(i);
        }
        int flag=0;
        ListNode temp = head;
        int component=0;
        while(temp!=null){
            if(flag==0 && set.contains(temp.val)){
                component++;
                flag=1;
                temp=temp.next;
            }
            else if(flag==1 && set.contains(temp.val)){
                temp=temp.next;
            }
            else {
                temp=temp.next;
                flag=0;
            }    
        }
        return component;
    }
}