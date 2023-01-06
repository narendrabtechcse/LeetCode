class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        
        int remainingCoins = coins;
        int icecreams=0;
        for(int i=0;i<costs.length;i++)
        {
            remainingCoins = remainingCoins-costs[i];
            if(remainingCoins>=0)
                icecreams++;
            else
                break;
        }
        return icecreams;
    }
}