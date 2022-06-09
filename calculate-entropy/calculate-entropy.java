class Solution {
    public double calculateEntropy(int[] input) {
        
        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i:input)
            {
            map.put(i,map.getOrDefault(i,0) + 1);
            }
        double ans=0;
        int size=input.length;
        for(int val:map.values())
            {
           double v=(double)val/size;
            System.out.println(v);
            ans+=(-(v*(Math.log(v)/Math.log(2))));
            }

            return ans;
        
    }
}