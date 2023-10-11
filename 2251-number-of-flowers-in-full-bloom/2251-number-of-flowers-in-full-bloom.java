class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        // create two arrays that will store the start and the end
        // blooming times of each flower and sort the arrays
        int flowersLength = flowers.length;
        int[] startBlooming = new int[flowersLength];
        int[] endBlooming = new int[flowersLength];
        for (int index = 0; index < flowersLength; index++) {
            startBlooming[index] = flowers[index][0];
            // add 1 because the bounds provided are inclusive; the blooming ends at the time given + 1
            endBlooming[index] = flowers[index][1] + 1; 
        }

        Arrays.sort(startBlooming);
        Arrays.sort(endBlooming);

        int peopleLength = people.length;
        int[] answer = new int[peopleLength];

        // for each person, do a binary search on both arrays to retrieve
        // 1. the number of flowers that have started blooming
        // 2. the number of flowers that have stopped blooming
        // the answer is the difference between those two numbers
        for (int index = 0; index < peopleLength; index++) {
            int target = people[index];
            int flowersStartBlooming = binarySearch(startBlooming, target);
            int flowersStopBlooming = binarySearch(endBlooming, target);
            answer[index] = flowersStartBlooming - flowersStopBlooming;
        }

        return answer;
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = arr[mid];

            if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

}