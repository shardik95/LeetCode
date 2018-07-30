class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length ==0)
            return "";
        return LCPHelper(strs,0,strs.length-1);
    }
    
    private String LCPHelper(String[] strs,int left, int right){
        if(left==right)
            return strs[left];
        else{
            int m = (left+right)/2;
            String leftLCP = LCPHelper(strs,left,m);
            String rightLCP = LCPHelper(strs,m+1,right);
            return commonPrefix(leftLCP,rightLCP);
        }
    }
    
    private String commonPrefix(String l,String r){
        int min = Math.min(l.length(),r.length());
        for(int i=0;i<min;i++){
            if(l.charAt(i)!=r.charAt(i))
                return l.substring(0,i);
        }
        return l.substring(0,min);
    }
}