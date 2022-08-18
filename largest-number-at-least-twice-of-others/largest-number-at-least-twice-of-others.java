class Solution {
    public int dominantIndex(int[] nums) {

		int maxValue = 0;
		int length = nums.length;

		int max = nums[0];
		boolean twice = false;
		int index = 0;
		for (int counter = 0; counter < length; counter++) {
			if (nums[counter] > max) {
				max = nums[counter];
				index = counter;
			}
		}

		for (int counter = 0; counter < length; counter++) {
			if (counter != index) {
				if (max >= 2 * nums[counter]) {
					twice = true;
				}

				else {
					twice = false;
					return -1;
				}
			}
		}

		if (twice) {
			return index;
		}

		else {
			return -1;
		}

	}
}