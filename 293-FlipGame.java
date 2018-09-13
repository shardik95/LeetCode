class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> ans = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='+'&&s.charAt(i+1)=='+'){
                sb.append(s.substring(0,i)+"--"+s.substring(i+2,s.length()));
                ans.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        return ans;
    }
}