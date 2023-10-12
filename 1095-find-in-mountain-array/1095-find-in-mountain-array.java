/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int lf = 0, rt = n - 1;
        int top = findTop(mountainArr, 0, n - 1);
        int res = findTarget(mountainArr, 0, top, target, 1);
        if(res != -1) return res;
        return res = findTarget(mountainArr, top, n - 1, target, -1);
    }
    private int findTop(MountainArray mountainArr, int lf, int rt){
        while(lf < rt){// find peek
            int mid = (lf + rt) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1))
                rt = mid - 1;
            else
                lf = mid + 1;
        }
        return lf;
    }
    private int findTarget(MountainArray mountainArr, int lf, int rt, int target, int left){
        while(lf <= rt){
            int mid = (lf + rt) / 2;
            int midVal = mountainArr.get(mid);
            if(midVal == target) return mid;
            if((midVal * left > target * left))
                rt = mid - 1;
            else
                lf = mid + 1;
        }
        return -1;
    }
}