class Solution {
    


    public static int firstUniqChar(String s) {

        int[] indexOccArr = new int[256];

        for (int i = 0; i < indexOccArr.length; i++) {
            indexOccArr[i] = -1;
        }

        for(int j=0;j<s.length();j++)
        {
            if(indexOccArr[s.charAt(j)]==-1)
            {
                indexOccArr[s.charAt(j)] = j;
            }else{
                indexOccArr[s.charAt(j)]=-2;
            }
        }

        int res =  Integer.MAX_VALUE;

        for(int i = 0; i<256; i++) {
            if(indexOccArr[i] >= 0)
                res = Math.min(res, indexOccArr[i]);
        }


        if(res ==  Integer.MAX_VALUE) return -1;
        else return res;


    }
}