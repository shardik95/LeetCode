class Solution {
    public String customSortString(String S, String T) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(char c:T.toCharArray()){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        StringBuilder sb = new StringBuilder();
        for(char c:S.toCharArray()){
            if(T.indexOf(c)>=0){
                int count = map.get(c);
                while(count>0){
                    sb.append(c);
                    count--;
                }
            }
        }
        String s = sb.toString();
        for(char c:T.toCharArray()){
            if(s.indexOf(c)<0)
                sb.append(c);
        }
        
        return sb.toString();
        
    }
}