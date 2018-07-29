class Solution {
    public String toGoatLatin(String S) {
        String words[] = split(S);
        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        vowels.add('a');
        int c =1;
        for(String word: words){
            StringBuilder temp = new StringBuilder();
            char[] arr = word.toCharArray();
            int d =0;
            while(d!=c){
                temp.append('a');
                d++;
            }
            char x = arr[0];
            for(int i=0;i<arr.length;i++){
                if(vowels.contains(x)){
                    sb.append(arr[i]);
                }
                else{
                    if(i+1<arr.length){
                        arr[i]=arr[i+1];
                    }
                    
                    if(i==arr.length-1){
                        arr[i] = x;
                        sb.append(arr);
                    }
                }
                
            }
            sb.append("ma");
            sb.append(temp.toString());
            sb.append(" ");
            c++;
        }
        return sb.toString().trim();
    }
    
    private String[] split(String s){
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                list.add(sb.toString());
                sb = new StringBuilder();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        list.add(sb.toString());
        return list.toArray(new String[list.size()]);
    }
}