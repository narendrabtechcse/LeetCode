class Solution {
     public boolean backspaceCompare(String s, String t) {
        return clearReversedOf(s).equals(clearReversedOf(t));
    }
    
    public String clearReversedOf(String str) {
        var sb = new StringBuilder();
        for (int signs = 0, i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '#') {
                signs++;
                continue;
            }
            if (signs == 0) { sb.append(str.charAt(i)); }
            else { signs--; }
        }
        return sb.toString();
    }
}