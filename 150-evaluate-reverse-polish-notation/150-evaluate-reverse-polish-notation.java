class Solution {
    public int evalRPN(String[] tokens) {
        Stack stack = new Stack();
        
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*")  || tokens[i].equals("/") )
            {
                if(!stack.empty()){
                int newVal=0;
                int elem1 = Integer.valueOf((String) stack.pop());
                int elem2 = Integer.valueOf((String) stack.pop());
                if(tokens[i].equals("+"))
                newVal = elem1+elem2;
                 if(tokens[i].equals("-"))
                newVal = elem2-elem1;
                 if(tokens[i].equals("*"))
                newVal = elem1*elem2;
                 if(tokens[i].equals("/"))
                newVal = elem2/elem1;
                
                stack.push(String.valueOf(newVal));
                }
            }else{
                stack.push(tokens[i]);
            }
        }
        
        return Integer.valueOf((String) stack.pop());
        
    }
}