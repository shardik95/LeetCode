class MyCircularDeque {
    int queue[];
    int front = 0;
    int rear = 0;
    int len = 0;
    
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        queue = new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(!isFull()){
            queue[(((front-1)%queue.length)+queue.length)%queue.length]=value;
            front--;
            len++;
            return true;
        }
        return false;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(!isFull()){
            queue[(((rear)%queue.length)+queue.length)%queue.length]=value;
            rear++;
            len++;
            return true;
        }
        return false;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(!isEmpty()){
            front++;
            len--;
            return true;
        }
        return false;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
         if(!isEmpty()){
            rear--;
            len--;
            return true;
        }
        return false;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(!isEmpty())
            return queue[(((front)%queue.length)+queue.length)%queue.length];
        return -1;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(!isEmpty())
            return queue[(((rear-1)%queue.length)+queue.length)%queue.length];
        return -1;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return len==0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return len==queue.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */