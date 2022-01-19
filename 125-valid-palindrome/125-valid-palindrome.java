class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("\\s", "");
        
       s = s.replaceAll("[^a-zA-Z0-9]", "");  
        
        StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    String rev=sb.toString();  
    if(s.equals(rev)){  
        return true;  
    }else{  
        return false;  
    }  
        
        
    }
}