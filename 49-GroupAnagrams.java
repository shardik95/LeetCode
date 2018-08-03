class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']=arr[s.charAt(i)-'a']+1;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]);
                sb.append("#");
            }
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