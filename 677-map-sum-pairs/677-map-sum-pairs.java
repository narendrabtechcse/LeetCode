class MapSum {
     Map<String,Integer> map;
    class TrieNode {
        public boolean isWord;
        public Map<Character, TrieNode> childrenMap = new HashMap<>();
    }

    private TrieNode root;
    
    

    public MapSum() {
        map = new HashMap<String,Integer>();
        root = new TrieNode();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum=0;
        for (String key : map.keySet()) {
            if(key.startsWith(prefix))
                sum = sum + map.get(key);
        }
        return sum;
    }
    
    public boolean startsWith(String prefix)
    {
        TrieNode cur = root;
        for(int i=0;i<prefix.length();i++)
        {
            char c = prefix.charAt(i);
            if(cur.childrenMap.get(c)==null){
                return false;
            }
            
            cur = cur.childrenMap.get(c);
        }
        
        return true;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */