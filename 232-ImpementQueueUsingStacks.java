class MyQueue {

    Stack<Integer> stack;
    int first = -1;
    /** Initialize your data structure here. */
    public MyQueue() {
         stack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        if(first==-1)
            first = x;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> temp = new Stack<Integer>();
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int ret = temp.pop();
        if(!temp.isEmpty())
            first = temp.peek();
        else
            first = -1;
        
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return ret;
    }
    
    /** Get the front element. */
    public int peek() {
        return first;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */