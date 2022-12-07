class Solution {
    public String reverseVowels(String s) {

        char[] ch = s.toCharArray();
        int start=0;
        int end = ch.length-1;
        boolean startFlag=false,endFlag=false;


        while(start<=end)
        {
            if(ch[start]=='a'|| ch[start]=='e'|| ch[start]=='i'|| ch[start]=='o'||ch[start]=='u'|| ch[start]=='A'|| ch[start]=='E'|| ch[start]=='I'|| ch[start]=='O'||ch[start]=='U')
            startFlag = true;
            else
            startFlag = false;

            if(ch[end]=='a'|| ch[end]=='e'|| ch[end]=='i'|| ch[end]=='o'|| ch[end]=='u' || ch[end]=='A'|| ch[end]=='E'|| ch[end]=='I'|| ch[end]=='O'|| ch[end]=='U')
            endFlag = true;
            else
            endFlag = false;

            char temp ;
            if(startFlag && endFlag){
            temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
            } 
            
            if(!startFlag)
            {
                start++;
            }  
            
            if(!endFlag)
            {
                end--;
            }
        }
        return new String(ch);
    }
}