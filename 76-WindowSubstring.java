class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int end = 0;
        int begin = 0;
        int l = Integer.MAX_VALUE;
        int count = t.length();
        int head = 0;
        for(int i=0;i<t.length();i++){
            char x = t.charAt(i);
            if(map.containsKey(x))
                map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        while(end<s.length()){
            char x = s.charAt(end);
            if(map.containsKey(x)){
                 if(map.get(x)>0) count--;
                 map.put(x,map.get(x)-1);
            }
            end++;
            while(count ==0){
                if(l > end - begin){
                    l = end - begin;
                    head = begin;
                }
                char first = s.charAt(begin);
                if(map.containsKey(first)){
                    map.put(first,map.get(first)+1);
                    if(map.get(first)>0) count++;
                }
                begin++;
            }
            
        }
        return l==Integer.MAX_VALUE? "":s.substring(head,head+l);
    }
}