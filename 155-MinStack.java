class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstk = new Stack<Integer>();
    public MinStack() {
        
    }
    
    public void push(int x) {
        stack.push(x);
        if(minstk.isEmpty())
            minstk.push(x);
        else{
            if(minstk.peek()>=x)
                minstk.push(x);
        }
    }
    
    public void pop() {
        int x = stack.pop();
        if(minstk.peek()==x)
            minstk.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstk.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */