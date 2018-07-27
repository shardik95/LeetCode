class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String s:words){
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<arr.length;i++){
                int x = (int)(arr[i]-'a');
                sb.append(code[x]);
            }
            set.add(sb.toString());
        }
        
        return set.size();
    }
}