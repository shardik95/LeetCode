class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        generateHelper(numRows,ans);
        return ans;
    }
    
    private void generateHelper(int numRows,List<List<Integer>> ans){
        if(numRows>=1){
            if(numRows == 1){
                 ans.add(new ArrayList<Integer>(Arrays.asList(1)));
                return;
            }
            generateHelper(numRows-1,ans);
            List<Integer> intermed = ans.get(ans.size()-1);
            List<Integer> res = new ArrayList<Integer>();
            res.add(1);
            for(int i=1;i<intermed.size();i++){
                int sum = intermed.get(i-1)+intermed.get(i);
                res.add(sum);
            }
            res.add(1);
            ans.add(res);
        }
    }
}