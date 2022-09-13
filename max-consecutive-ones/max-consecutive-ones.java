class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int k=0;
        int maxOne=0;
        for(int counter=0;counter<nums.length;counter++)
        {
            if(nums[counter]==1)
            {
                k++;
                
                if(k>maxOne)
                {
                    maxOne=k;
                }
            }
            
            else{
                k=0;
            }
        }
        
        return maxOne;
    }
}