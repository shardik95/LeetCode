class Solution {
    public String reverseString(String s) {
        int i = 0;
        int k = s.length() - 1 ;
        char[] arr = s.toCharArray();
        
        while(i<k){
            char temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
        return new String(arr);
    }
}