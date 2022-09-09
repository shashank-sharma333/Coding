class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    
        int maxLengthSequence=0;
        int left=0;
        int right=0;
        int numZero=0;
        
        
        while(right< nums.length)
        {
           
            if(nums[right]==0)
            {  
            numZero++;}
            
        while(numZero==2)      
        {   
            if(nums[left]==0)
            {numZero--;}
        
            left++;
        }
            
        maxLengthSequence = Math.max(maxLengthSequence, right-left+1);
            
        right++;
        }
        
        return maxLengthSequence;
        
        
        
        
        
        
        /*  int maxCountZeroes=0;
        int countZeroes=0;
        for(int counter=0;counter<nums.length-1;counter++)
        {
            if(nums[counter]==0 && nums[counter+1]==1)
            {
                countZeroes++;
                nums[counter]=1;
                nums[counter+1]=0;
            }
           
            else{
                if(countZeroes>maxCountZeroes)
                {
                    maxCountZeroes=countZeroes;
                    countZeroes=0;
                }             
            }
        }
        return maxCountZeroes;*/
    }
}