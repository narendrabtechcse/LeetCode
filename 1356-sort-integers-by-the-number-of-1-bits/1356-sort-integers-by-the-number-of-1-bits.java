class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        List<Integer>[] countMap = new ArrayList[32];
        for (int num : arr) {
            int count = 0;
            for (int i = 0; i < 32; i++) {
                count += (num >> i) & 1;
            } 
            if (countMap[count] == null) {
                countMap[count] = new ArrayList<>();
            }
            countMap[count].add(num);
        }

        int[] res = new int[arr.length];
        int index = 0;
        for (int i = 0; i < 32; i++) {
            if (countMap[i] != null) {
                for (int num : countMap[i]) {
                    res[index] = num;
                    index++;
                }
            }
        }
        return res;
    }
}