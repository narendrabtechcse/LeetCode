class Solution {
    public String toLowerCase(String s) {
      char[] lowerString=new char[s.length()];
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                int a=(int)s.charAt(i);
                a=a+32;
                lowerString[i]=(char)a;
            }
            else{
                lowerString[i]=s.charAt(i);
            }
        }
        return new String(lowerString);
    }
}