class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
         
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for (int i = 0;i < n;i ++) {
            while (!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                int pre = st.pop();
                ans[pre] = i - pre;
            }
            
            st.push(i);
        }
        
        return ans;
        
    }
}