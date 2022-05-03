class Solution {
    public List<Integer> getRow(int rowIndex) {
        
         Integer[] arr = new Integer[rowIndex+1];
        Arrays.fill(arr, 0);
        for(int i=0; i<=rowIndex; i++) {
           for(int j=i; j>=0; j--) {
               if (j==0 || j==i) { arr[j] = 1; continue; }
               arr[j] = arr[j] + arr[j-1];
           }
        }
        return Arrays.asList(arr);
        
    }
}