class Solution {
    public int singleNumber(int[] nums) {
        
		HashMap<Integer,Integer> test = new HashMap<Integer,Integer>();
        
        for(int counter=0;counter<nums.length;counter++)
        {
            if(test.containsKey(nums[counter]))
          
            {   int value=test.get(nums[counter]);
                test.put(nums[counter],value+1);
            }
           
            else{
                 test.put(nums[counter],1);
            }
        }
        
      for (Map.Entry<Integer,Integer> mapElement : test.entrySet()) {
             Integer key = mapElement.getKey();
             int value = mapElement.getValue();
                
             if(value==1)
             {
                 return key;
             }
        }
            
        
       return 0; 
    }
}