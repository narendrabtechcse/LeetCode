class MinStack {
    
    List<Integer> stack = new ArrayList<>();
    
    List<Integer> minStack = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.add(val);
        if(minStack.isEmpty())
            minStack.add(val);
        else if(val<=minStack.get(minStack.size()-1))
        {
            minStack.add(val);
        }
    }
    
    public void pop() {
        
        
        if(!minStack.isEmpty())
        if(stack.get(stack.size()-1)<=minStack.get(minStack.size()-1))
        {
           stack.remove(stack.size()-1);
           minStack.remove(minStack.size()-1);
        }else{
            stack.remove(stack.size()-1);
        }
        
        
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */