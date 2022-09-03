class Solution {
    public int removeDuplicates(int[] nums) {
        
    if (nums.length == 0) return 0;
    int outerCounter = 0;
    for (int counter = 1; counter < nums.length; counter++) {
        if (nums[counter] != nums[outerCounter]) {
            outerCounter++;
            nums[outerCounter] = nums[counter];
        }
    }
    return outerCounter + 1;
    }
}