class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        return cost_of_travel(days,costs,365);
    }
    
    public int cost_of_travel(int[] days,int[] costs,int n)
    {
        int[] dp = new int[n+1];
        int dayCounter=0;
        dp[0] = 0;
        
        for(int i=1;i<=n;i++)
        {
            if(dayCounter==days.length)
                break;
    
            if(i!=days[dayCounter])
            {
                dp[i] = dp[i-1];
            }else{
                int one = costs[0] + dp[i-1];
                int seven = costs[1] + dp[Math.max(0, i-7)];
                int thirty = costs[2] + dp[Math.max(0, i-30)];
                        
                dp[i] = Math.min(one , Math.min(seven,thirty));
                dayCounter++;
            }
        }
        return dp[days[days.length-1]];
    }
}