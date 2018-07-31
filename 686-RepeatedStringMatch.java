class Solution {
    public int repeatedStringMatch(String A, String B) {
        // if(B.length()<=A.length() && !A.contains(B))
            // return -1;
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int c = 1;
        int l = A.length();
        while(l<B.length()){
            sb.append(A);
            l=l+A.length();
            c++;
        }
        if(sb.toString().contains(B))
            return c;
        sb.append(A);
        if(sb.toString().contains(B))
            return c+1;
        
        return -1;
    }
}