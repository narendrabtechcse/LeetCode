class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        Map<Character,String> map = new HashMap<Character,String>();
        
        String[] sArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set set = new HashSet();
        
        for(String word : words)
        {
        StringBuilder build = new StringBuilder();
            
        for (char ch : word.toCharArray())
            build.append(sArr[(int)ch - 97]);
            
            set.add( build.toString());
        }
        
        return set.size();
    }
}