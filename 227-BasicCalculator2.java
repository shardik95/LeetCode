class Solution {
    public int calculate(String s) {
        int ans = 0;
        int prev = 0;
        int num = 0;
        char op = '+';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                continue;
            else if(Character.isDigit(s.charAt(i))){
                num = s.charAt(i)-'0';
                while(i+1<s.length() && Character.isDigit(s.charAt(i+1))){
                    num = num*10 + (s.charAt(i+1)-'0');
                    i++;
                }
                
                switch(op){
                    case '+': ans += num;
                        prev = num;
                        num = 0;
                        break;
                    case '-': ans -= num;
                        prev = -num;
                        num = 0;
                        break;
                    case '*':ans = ans - prev + prev*num;
                        prev = prev*num;
                        num = 0;
                        break;
                    case '/':ans = ans - prev + prev/num;
                        prev = prev/num;
                        num = 0;
                        break;
                }
            }
            else{
                op = s.charAt(i);
            }
        }
        return ans;
    }
}