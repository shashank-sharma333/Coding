class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
       
        Map<Integer,Boolean> value= new HashMap<Integer,Boolean>();
        
        for(int counter=0;counter<nums.length;counter++)
        {
          value.put(nums[counter],true);
        }
        
        
        List<Integer> list= new ArrayList<Integer>();
        
        for(int count=1;count<=nums.length;count++)
        {
            if(!(value.containsKey(count)))
            {
                list.add(count);
            }
        }
        /* Arrays.sort(nums);
        
		Set<Integer> targetSet = new HashSet<Integer>();
        
        for(int counter=0;counter<nums.length;counter++)
        {
          targetSet.add(nums[counter]);
        }
        
        List<Integer> aList= new ArrayList();

          int count=1;
        
        for(int value : targetSet){     
          
            if(count!=value)
            {aList.add(count);}
            
            count++;
        }*/
        

      /*  List<Integer> aList
        = targetSet.stream().collect(Collectors.toList());*/
        
        return list;
    }
}