class Solution {
    public int scoreOfParentheses(String S) {
        if(S.length()==0)
            return 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')
                stack.push(-1);
            else{
                int v=0;
                while(stack.peek()!=-1){
                    v=v+stack.pop();
                }
                stack.pop();
                stack.push(v==0?1:2*v);
            }
        }
        int res=0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        return res;
    }
}