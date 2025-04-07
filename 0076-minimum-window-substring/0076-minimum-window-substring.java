class Solution {
    public String minWindow(String s, String t) {
         if (s.length() == 0 || t.length() == 0) return "";

        // Frequency map of characters in t
        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int required = tCount.size(); // Unique characters in t
        int formed = 0; // Unique characters matched in window

        Map<Character, Integer> windowCount = new HashMap<>();

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0, minRight = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && windowCount.get(c).intValue() == tCount.get(c).intValue()) {
                formed++;
            }

            // Try shrinking the window from the left
            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                    minRight = right;
                }

                char leftChar = s.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);

                if (tCount.containsKey(leftChar) && windowCount.get(leftChar) < tCount.get(leftChar)) {
                    formed--;
                }

                left++; // Move left pointer
            }

            right++; // Expand right pointer
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minRight + 1);
    }
}