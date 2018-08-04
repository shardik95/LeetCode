class Solution {
    public String countAndSay(int n) {
        String s = "1";
        if(n==1)
            return s;
        int i=1;
        while(i<n){
            int count =1;
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<s.length();j++){
                if(j+1<s.length()&&s.charAt(j)==s.charAt(j+1)){
                    count++;
                }
                else{
                    temp.append(""+count);
                    temp.append(s.charAt(j));
                    count =1;
                }
            }
            s = temp.toString();
            i++;
        }
        return s;
    }
}