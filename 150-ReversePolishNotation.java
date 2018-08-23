class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                stk.push(stk.pop()+stk.pop());
            }
            else if(tokens[i].equals("-")){
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y-x);
            }
            else if(tokens[i].equals("*")){
                stk.push(stk.pop()*stk.pop());
            }
            else if(tokens[i].equals("/")){
                int x = stk.pop();
                int y = stk.pop();
                stk.push(y/x);
            }
            else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        return stk.peek();
    }
}