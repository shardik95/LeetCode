class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> map =new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        
        int prev = -1;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            int add = map.get(""+c);
            if(add>=prev){
                sum=sum+add;
                prev =add;
            }
            else{
                sum=sum-add;
                prev = add;
            }
        }
        return sum;
    }
}