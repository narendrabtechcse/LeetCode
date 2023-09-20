class Solution {
    public int minOperations(int[] n, int x){
        int s=-x;
        for(int i:n)
        {
            s+=i;
        }
        int k=n.length;
        if(s==0)
            return k;
        Map<Integer,Integer> nm=new HashMap<>();
        int r=Integer.MIN_VALUE;
        int p=0;
        nm.put(0,-1);
        for(int i=0;i<k;i++)
        {
            p=p+n[i];
            if(nm.containsKey(p-s))
                r=Math.max(r,i-nm.get(p-s));
            nm.put(p,i);
        }
        return r==Integer.MIN_VALUE ? -1 : k-r;
    }
}