public class Solution {
    public String reverseWords(String s) {
         if(s==null)
             return null;
        String arr[] = s.trim().split("\\s+");
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        if(arr.length==1)
            return arr[0];
        return String.join(" ",arr);
            
            
    }
}