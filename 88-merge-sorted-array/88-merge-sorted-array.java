class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if(nums2.length==0)
            return;
        
        int finalSize = m+n;
        
        m--;
        n--;
        finalSize--;
        
        for(int i=0;i<nums1.length;i++)
        {
            if(m>=0 && n>=0){
            if(nums1[m]>=nums2[n] )
            {
                nums1[finalSize] = nums1[m];
                m--;
                finalSize--;
            }else{
                 nums1[finalSize] = nums2[n];
                 n--;
                 finalSize--;
            }
                
                }else{
                if(m<0){
                     nums1[finalSize] = nums2[n];
                 n--;
                 finalSize--;
                    }
            }
        }
        
    }
}