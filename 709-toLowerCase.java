class Solution {
    public String toLowerCase(String str) {
        
        char[] arr = str.toCharArray();
        StringBuilder ans = new StringBuilder();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A'&& arr[i]<='Z')
                ans.append(""+(char)((int)(arr[i])+32));
            else ans.append(""+arr[i]);
        }
        
        return ans.toString();
        
    }
}