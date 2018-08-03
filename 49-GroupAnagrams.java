class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            sb.append(arr);
            String key = sb.toString();
            if(map.containsKey(key)){
                List<String> l = map.get(key);
                l.add(s);
                map.put(key,l);
            }
             else{
                 map.put(key,new ArrayList<String>());
                 List<String> l = map.get(key);
                 l.add(s);
                 map.put(key,l);
             }
        }
        
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        
        return ans;
    }
}