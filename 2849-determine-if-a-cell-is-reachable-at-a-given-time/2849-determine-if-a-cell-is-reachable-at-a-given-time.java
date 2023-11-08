class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(t==1 && sx==fx && sy==fy){
            return false;
        }
        int x_distance = Math.abs(fx-sx);
        int y_distance = Math.abs(sy-fy);
        return t>=(Math.min(x_distance,y_distance)+Math.abs(x_distance-y_distance));
    }
}