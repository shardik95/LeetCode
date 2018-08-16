class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0;i<ops.length;i++){
            String s = ops[i];
            if(s.equals("+")){
                int top = stk.pop();
                int nextTop = stk.pop();
                stk.push(nextTop);
                stk.push(top);
                stk.push(top+nextTop);
            }
            else if(s.equals("C")){
                stk.pop();
            }
            else if(s.equals("D")){
                int x = stk.pop();
                stk.push(x);
                stk.push(2*x);
            }
            else{
                stk.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }
        return sum;
    }
}