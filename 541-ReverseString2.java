class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i=i+2*k){
            int l = i;
                int j= Math.min(i+k-1,s.length()-1);
                while(l<j){
                    char temp = arr[l];
                    arr[l] = arr[j];
                    arr[j] = temp;
                    l++;
                    j--;
                }
        }
        return new String(arr);
    }
}