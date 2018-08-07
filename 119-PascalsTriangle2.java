class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0)
            return Arrays.asList(1);
        if(rowIndex==1)
            return Arrays.asList(1,1);
        
        List<Integer> temp = getRow(rowIndex-1);
        List<Integer> ans = new ArrayList<Integer>();
        int in = 0;
        ans.add(1);
        while(in<temp.size()-1){
            int sum = temp.get(in)+temp.get(in+1);
            ans.add(sum);
            in++;
        }
        ans.add(1);
        return ans;
    }
}