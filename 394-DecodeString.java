class Solution {
    public String decodeString(String s1) {
        String res="";
        String str = "";
        Stack<String> s = new Stack<>();
        for(int i=0;i<s1.length();i++){
            char x = s1.charAt(i);
            if(x=='['){
                str = "";
            }
            else if(Character.isLetter(x)){
                str = str + x;
                if(i==s1.length()-1)
                    s.push(str);
            }
            else if(Character.isDigit(x)){
                int n = x-'0';
                while(i+1<s1.length()&&Character.isDigit(s1.charAt(i+1))){
                    n=n*10+(s1.charAt(i+1)-'0');
                    i++;
                }
                if(!str.equals("")){
                    s.push(str);
                }
                s.push(""+n);
            }
            else if(x==']'){
                if(str.length()>0)
                    s.push(str);
                str="";
                while(!s.isEmpty() && s.peek().length()>0 && !(s.peek().charAt(0)>='0' && s.peek().charAt(0)<='9')){
                    str = s.pop() + str;
                }
                int no = Integer.parseInt(s.pop());
                String temp = str;
                str = "";
                while(no!=0){
                    str = str + temp;
                    no--;
                }
                s.push(str);
                str = "";
            }
        }
        while(!s.isEmpty())
            res = s.pop() + res;
        return res;
    }
}