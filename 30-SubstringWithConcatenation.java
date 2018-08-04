class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int len = 0;
        if(words.length==0)
            return list;
        for(String word:words){
            if(len!=0 && word.length()!=len)
                return list;
            len = word.length();
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int i=0;
        Map<String,Integer> tmp = new HashMap<String,Integer>();
        while(i<s.length()-words.length*len+1){
            tmp.clear();
            int j=i;
            while(j+len <= s.length()){
                String substr = s.substring(j, j+len);
                tmp.put(substr, tmp.getOrDefault(substr ,0)+1);
                if(map.containsKey(s.substring(j, j+len))){
                    if(tmp.get(substr) > map.get(substr))
                        break;
                }else
                    break;
                
                j=j+len;
            }
            if((j-i) == words.length*len)
                list.add(i);
            i++;
        }
        return list;
    }
}