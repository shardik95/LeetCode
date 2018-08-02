class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:paths){
            String split_arr[] = s.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<split_arr.length;i++){
                sb.append(split_arr[0]+"/"+split_arr[i].split("\\(")[0]);
                String content = split_arr[i].split("\\(")[1].split("\\)")[0];
                if(map.containsKey(content)){
                    List<String> list = map.get(content);
                    list.add(sb.toString());
                    map.put(content,list);
                }
                else{
                    List<String> newlist = new ArrayList<>();
                    newlist.add(sb.toString());
                    map.put(content,newlist);
                }
                sb = new StringBuilder();
            }
        }
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
           if(entry.getValue().size()>1){
               ans=entry.getValue();
               res.add(ans);
           }
            ans = new ArrayList<>();
        }
        return res;
    }
}