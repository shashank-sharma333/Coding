class Solution {
    public int thirdMax(int[] nums) {
                
		Set<Integer> targetSet = new HashSet<Integer>();
        
        for(int element:nums)
        {
            targetSet.add(element);
        }
        
        int maximum=Collections.max(targetSet);
        
        
        if(targetSet.size()<3)
        {
            return maximum;
        }
        
        
        targetSet.remove(maximum);
        
        int secondMaximum=Collections.max(targetSet);
        
        targetSet.remove(secondMaximum);
        
        return Collections.max(targetSet);
        
     /*   
        Iterator<Integer> it = targetSet.iterator();
		
        int count=0;
        int element=0;
		
       if(targetSet.size()>=3) 
       {    
           
           while(it.hasNext() && count!=4)
		{
			element=it.next();
            
            count++;
            if(count==3)
            {
                   
            }
		}
       }
        
    else{
           int maximum=it.next();
         
        while(it.hasNext())
		{
            int value=it.next();
			if(value>maximum)
            {
                maximum=value;
            }
            count++;
		}
        
        return maximum;
    }
             
        return element;*/
        
    }
}