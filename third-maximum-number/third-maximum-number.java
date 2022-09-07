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
        
    }
}