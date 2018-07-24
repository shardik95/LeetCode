/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int length = getLength(root);
        if(length<=k){
            ListNode[] list = new ListNode[k];
            ListNode temp = root;
            for(int i=0;i<k;i++){
                list[i]=null;
            }
            for(int i=0;i<length&&temp!=null;i++){
                list[i]=new ListNode(temp.val);
                temp=temp.next;
            }
            return list;
        }
        else{
            int size = length/k;
            int buffer = length%k;
            ListNode[] list = new ListNode[k];
            int c = 0;
            int s = 1;
            ListNode temp = root;
            for(int i=0;i<k;i++){
                int leng=size;
                if(buffer!=0)
                    leng = size+1;
                ListNode ind_list=null;
                ListNode track = ind_list;
                int d =0;
                ListNode prev = null;
                while(temp!=null&&d!=leng){
                    if(d==0){
                        ind_list=new ListNode(temp.val);
                        prev = ind_list;
                    }
                    else{
                        ListNode n = new ListNode(temp.val);
                        prev.next = n;
                        prev = n;
                    }
                        d++;
                        temp=temp.next;
                }
                list[c]=ind_list;
                c++;
                if(buffer>0)
                    buffer--;
            }
            return list;
        }
    }
    
    private int getLength(ListNode root){
        int length = 0;
        while(root!=null){
            length++;
            root=root.next;
        }
        return length;
    }
}