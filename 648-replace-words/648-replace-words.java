class Solution {
    
    class TrieNode {
        public boolean isWord;
        public Map<Character, TrieNode> childrenMap = new HashMap<>();
    }
    
    private TrieNode root;

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(cur.childrenMap.get(c) == null){
                // insert a new node if the path does not exist
                cur.childrenMap.put(c, new TrieNode());
            }
            cur = cur.childrenMap.get(c);
        }
        cur.isWord = true;
    }

    /** Returns if the word is in the trie. */
    public String searchPrefix(String word) {
        TrieNode cur = root;
        String str = "";
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(cur.childrenMap.get(c) == null) {
                return null;
            }
            cur = cur.childrenMap.get(c);
            str = str + c;
            if(cur.isWord==true)
                return str;
        }
        return null;
    }


    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        
        for(String dict : dictionary)
        {
            insert(dict);
        }
        
        StringBuilder ans = new StringBuilder();
        
        String[] inputStr = sentence.split(" ");
        
        int count = 0;
        for(String word : inputStr)
        {
            count++;
            String prefix = searchPrefix(word);
            if(prefix != null){
                ans.append(prefix);
            }else{
                ans.append(word);
            }
            
            if(count!=inputStr.length)
            ans.append(" ");
        }
        return ans.toString();
    }
}