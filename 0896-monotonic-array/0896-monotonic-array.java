class Solution {
   public boolean isMonotonic(int[] nums) {
		if (nums.length > 2) {
			if (nums[0] > nums[nums.length - 1]) {
				return decreasing(nums);
			} else {
				return increasing(nums);
			}
		} else {
			return true;
		}

	}

	boolean increasing(int[] nums) {
		int i = 1;
		while (nums.length > i) {
			if (nums[i] < nums[i - 1]) {
				return false;
			}
			i++;
		}
		return true;
	}

	boolean decreasing(int[] nums) {
		int i = 1;
		while (nums.length > i) {
			if (nums[i] > nums[i -1]) {
				return false;
			}
			i++;
		}
		return true;
	}
}