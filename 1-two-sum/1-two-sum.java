class Solution {
    
    public int[] twoSum(int[] nums, int target) 
      {
        int[] solution = new int[2]; 
        
        // HashMap created with corresponding key(data) and value (index)
        HashMap<Integer,Integer> dataMap = new HashMap();
        
        for(int i=0;i<nums.length;i++){
            if(dataMap.containsKey(target - nums[i])){
                solution[0] = i;
                solution[1] = dataMap.get(target - nums[i]);
            }
          else{
                   dataMap.put(nums[i],i);                                                     
          }
        }
     return solution;
    }
}
    /** 
   O(N2) approach
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
        
    }**/
