class Solution {
    
    
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] maxArrow = new int[256];
        for (String b : B) {
            int[] arrow = new int[256];
            for (char c : b.toCharArray()) {
                arrow[c]++;
            }
            for (int i = 0; i < 256; i++) {
                maxArrow[i] = Math.max(maxArrow[i], arrow[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (String a : A) {
            int[] arrow = new int[256];
            for (char c : a.toCharArray()) {
                arrow[c]++;
            }
            if (isUniversalWord(maxArrow, arrow)) {
                ans.add(a);
            }
        }
        return ans;
}
    
     public boolean isUniversalWord(int[] maxArrow, int[] arrow) {
        for (int i = 0; i < 256; i++) {
            if (arrow[i] < maxArrow[i]) {
                return false;
            }
        }
        return true;
    }
    
}