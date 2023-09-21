class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	var m = nums1.length;
	var n = nums2.length;
    var high = m;
	
	// ensuring nums2 is longer than num1
	if (m > n)
		return findMedianSortedArrays(nums2, nums1);
		
	for (var low = 0; low <= high;) {
	
		var p1 = low + high >> 1; // partition of nums1
		var p2 = (m + n + 1 >> 1) - p1; // partition of nums2. 
		// +1 because it plays well with both odd and even number of elements in the combined array
		var maxLeft1 = (p1 == 0) ? Integer.MIN_VALUE : nums1[p1 - 1];
		var minRight1 = (p1 == m) ? Integer.MAX_VALUE : nums1[p1];
		var maxLeft2 = (p2 == 0) ? Integer.MIN_VALUE : nums2[p2 - 1];
		var minRight2 = (p2 == n) ? Integer.MAX_VALUE : nums2[p2];

		if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) // median found
			if ((m + n & 1) == 0) // if m + n is even
				return (Math.max(maxLeft1, maxLeft2) 
					  + Math.min(minRight1, minRight2)) / 2d;
			else
				return Math.max(maxLeft1, maxLeft2) * 1d;
		else if (maxLeft1 > minRight2) // too right on nums1, move left
			high = p1 - 1;
		else // too left on nums1, move right
			low = p1 + 1;
	}

	return 0;
}
}