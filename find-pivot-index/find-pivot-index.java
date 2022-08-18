class Solution {
    public int pivotIndex(int[] nums) {
        
        int pivot=0;
        
        for(int counter=0;counter<nums.length;counter++)
        {
            int lSum=0;
            int rSum=0;
            
            //left side sum in array
            for(int leftCounter=counter-1;leftCounter>=0;leftCounter--)
            {
            lSum=lSum+nums[leftCounter];
            }     
           
            //right side sum in array
            for(int rightCounter=counter+1;rightCounter<nums.length;rightCounter++)
            {
            rSum=rSum+nums[rightCounter];
            }     
            
            if(lSum==rSum)
            {
                pivot=counter;
                return pivot;
            }
           
        }
        
        return -1;
        
    }
}