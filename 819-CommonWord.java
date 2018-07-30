class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph+".";
        Set<String> set = new HashSet<>();
        Map<String,Integer> countmap = new HashMap<String,Integer>();
        for(String s:banned)
            set.add(s);
        StringBuilder sb = new StringBuilder();
        int maxcount = -99;
        String ans="";
        for(char c:paragraph.toCharArray()){
            if(Character.isLetter(c))
                sb.append(Character.toLowerCase(c));
            else if(sb.length()>0){
                String word = sb.toString();
                //System.out.println(word);
                if(!set.contains(word)){
                    if(countmap.get(word)!=null)
                        countmap.put(word,countmap.get(word)+1);
                    else
                        countmap.put(word,1);
                    if(countmap.get(word)>maxcount){
                        maxcount=countmap.get(word);
                        ans = word;
                    }
                }
                sb = new StringBuilder();
            }
        }
        return ans;
    }
}