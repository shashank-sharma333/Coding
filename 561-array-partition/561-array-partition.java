class Solution {
    public int arrayPairSum(int[] nums) {
         Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // Add every element at even positions (0-indexed)
            maxSum += nums[i];
        }
        
        return maxSum;
    }
}