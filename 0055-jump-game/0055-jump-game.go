 func canJump(nums []int) bool {
    // Write your code here..
	
	goal := len(nums)-1 // 7

	for i := len(nums)-2; i >= 0; i-- { //6 to 0
		if (nums[i] + i >= goal) {
			goal = i
		}
	}

	if goal == 0 {
		return true
	}

	return false

}