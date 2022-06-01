class Solution {
     public int[] kWeakestRows(int[][] mat, int k) {

        int m = mat.length;
        int n = mat[0].length;

        // Calculate all the strengths and put them into a TreeMap.
        Map<Integer, List<Integer>> strengths = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int strength = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) break;
                strength++;
            }
            if (!strengths.containsKey(strength)) {
                strengths.put(strength, new ArrayList<>());
            }
            strengths.get(strength).add(i);
        }

        int[] indexes = new int[k];
        int i = 0;
        for (int key : strengths.keySet()) {
            for (int index : strengths.get(key)) {
                indexes[i] = index;
                i++;
                if (i == k) break;
            }
            if (i == k) break;
        }

        return indexes;
    }
}