class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int temp=0;
        int a[]=new int[2];
        for(int counter=0;counter<nums.length;counter++)
        {
            for(int innerCounter=counter;innerCounter<nums.length-1;innerCounter++)
            {
                if(nums[counter]+nums[innerCounter+1]==target)
                {
                    a[0]=counter;
                    a[1]=innerCounter+1;
                    return a;
                }
            }
        }
        
        return a;
        
    }
}