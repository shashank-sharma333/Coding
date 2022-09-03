class Solution {
    public int removeElement(int[] nums, int val) {
        
        int exchangeCounter=0;
               
        for(int counter=0;counter<nums.length; counter++)
        {
            if(nums[counter]!=val)
            {
               nums[exchangeCounter]=nums[counter];
               exchangeCounter++;
            }
        }
    
       return exchangeCounter;
    }
}