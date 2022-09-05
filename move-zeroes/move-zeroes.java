class Solution {
    public static int[] moveZeroes(int[] nums) {

		int n = 0;
		int zeroCounter = 0;

		for (int counter = 0; counter < nums.length; counter++) {
			if (nums[counter] != 0) {
				nums[zeroCounter] = nums[counter];
				zeroCounter++;
			}
		}

		for (int traverse = zeroCounter; traverse < nums.length; traverse++) {
			nums[traverse] = 0;
		}

		return nums;

	}
}