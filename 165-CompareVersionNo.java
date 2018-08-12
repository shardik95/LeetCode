class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int v1len = version1.length();
        int v2len = version2.length();
        
        while(i<v1len || j<v2len){
            
            int v1 = 0;
            while(i<v1len && version1.charAt(i)!='.'){
                v1 = 10*v1 + (version1.charAt(i)-'0');
                i++;
            }
            
            int v2 = 0;
            while(j<v2len && version2.charAt(j)!='.'){
                v2 = 10*v2 + (version2.charAt(j)-'0');
                j++;
            }
            
            if(v1<v2)
                return -1;
            else if(v1>v2)
                return 1;
            
            i++;
            j++;
            
        }
        return 0;
    }
}