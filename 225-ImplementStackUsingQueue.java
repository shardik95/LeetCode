class MyStack {

    /** Initialize your data structure here. */
    List<Integer> s;
    public MyStack() {
       s = new ArrayList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        s.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       int i = s.get(s.size()-1);
        s.remove(s.size()-1);
        return i;
    }
    
    /** Get the top element. */
    public int top() {
        return s.get(s.size()-1);
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */