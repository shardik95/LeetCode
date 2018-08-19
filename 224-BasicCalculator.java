class Solution {
    public int calculate(String s) {
        int res = 0;
        Stack<String> stk = new Stack<>();
        int sign = 1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int no = s.charAt(i)-'0';
                while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                    no = no*10 + (s.charAt(i+1)-'0');
                    i++;
                }
                res = res+sign*no;
            }
            else if(s.charAt(i)=='+')
                sign = 1;
            else if(s.charAt(i)=='-')
                sign = -1;
            else if(s.charAt(i)==' ')
                continue;
            else if(s.charAt(i)=='('){
                stk.push(""+res);
                stk.push(""+sign);
                res= 0;
                sign = 1;
            }
            else if(s.charAt(i)==')'){
                res = res*Integer.parseInt(stk.pop())+Integer.parseInt(stk.pop());
            }
            
        }
        return res;
        
    }
}