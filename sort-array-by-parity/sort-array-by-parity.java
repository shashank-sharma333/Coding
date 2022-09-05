class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int counter=0;
        int oddArray[]=new int[nums.length];
        int oddCount=0;
        
        for(int innerCounter=0;innerCounter<nums.length;innerCounter++)
        {
            if(nums[innerCounter]%2==0)
            {             
                
                nums[counter]=nums[innerCounter];
                counter++;
            }
            
            else{        
               oddArray[oddCount]=nums[innerCounter];
                oddCount++;
            }       
        }
        
        for(int traverse=0; traverse<oddCount;traverse++)
        {
            nums[counter]=oddArray[traverse];
            counter++;
        }
        
        return nums;
    }
}