class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int result=nums.length+1;
        int leftCounter=0;
        int sum=0;
       
        for(int counter=0;counter<nums.length;counter++)
        {
            sum=sum+nums[counter];
            
            while(sum>=target)
            {
                result= Math.min(result, counter+1-leftCounter);
                sum=sum-nums[leftCounter];
                leftCounter++;
            }
            
        }
        
        return (result!=nums.length+1)? result:0;
        
        
    }
}