class Solution {
    public int[] replaceElements(int[] arr) {
        
        int maxSeen=arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i=arr.length-2;i>=0;i--)
        {
            int localSeen= maxSeen;
            if(maxSeen<arr[i])
                maxSeen=arr[i];
            
            arr[i] = localSeen;
        }
        return arr;
    }
}