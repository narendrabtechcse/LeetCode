class Solution {
    public boolean isValid(String s) {

        Stack stack = new Stack();

        for(int i=0;i<s.length();i++)
        {
            if(stack.empty()){
                 if( s.charAt(i) == ']' || s.charAt(i)==')' || s.charAt(i)=='}')
                     return false;
            }
            if( s.charAt(i) == '(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                        stack.push(s.charAt(i));
            }else if(
                    ( s.charAt(i)==')' && !((char)stack.peek() == '(' ) )||
                    ( s.charAt(i)=='}' && !((char)stack.peek()=='{') ) || 
                            (s.charAt(i)==']' && !((char)stack.peek()=='[')))
            {
            return false;
        }else{
                stack.pop();
            }
            
        }
        
       if(!stack.empty())
        return false;
           
    
    return true;
    
    }
}