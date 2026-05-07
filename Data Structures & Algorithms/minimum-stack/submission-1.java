class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || minStack.peek()>=val) minStack.push(val);
        stack.push(val);
    }
    
    public void pop() {
        if(!minStack.isEmpty() && !stack.isEmpty() && stack.peek().equals(minStack.peek())){
           
            minStack.pop();
        }
         stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.isEmpty()?0 : minStack.peek();
    }
}
