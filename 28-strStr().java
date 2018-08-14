class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();
        int i=0;
        for(i=0;i<hay.length;i++){
            int index = i;
            if(hay[i]==need[0]){
                int j=0;
                while(i<hay.length && j<need.length && hay[i]==need[j]){
                    i++;
                    j++;
                }
                if(j==need.length)
                    return index;
                i=index;
            }
        }   
        if(i==hay.length)
            return -1;
        
        return -1;
    }
}