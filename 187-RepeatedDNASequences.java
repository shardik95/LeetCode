class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        if(s.length()<10)
            return ans;
        Map<String,Integer> map = new HashMap<>();
        int i=0, j = 10;
        while(j<=s.length()){
            String str = s.substring(i,j);
            int num = map.getOrDefault(str,0);
            if(num==1)
                ans.add(str);
            map.put(str,num+1);
            i++;
            j++;
        }
        return ans;
    }
}