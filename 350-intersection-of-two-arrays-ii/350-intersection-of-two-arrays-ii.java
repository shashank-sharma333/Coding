class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        

      Map<Integer, Integer> firstArrayMap = new HashMap<Integer, Integer>();
       
      for(int number:nums1)
      {
          if(!firstArrayMap.containsKey(number))
          {
              firstArrayMap.put(number,1);
          }
          else{
              firstArrayMap.put(number,(firstArrayMap.get(number)+1));
          }
      }
        
       Map<Integer, Integer> secondArrayMap = new HashMap<Integer, Integer>();

        for(int number:nums2)
      {
          if(!secondArrayMap.containsKey(number))
          {
              secondArrayMap.put(number,1);
          }
          else{
              secondArrayMap.put(number,(secondArrayMap.get(number)+1));
          }
      }
        
     List<Integer> list=new ArrayList<Integer>();
        
       for (int key : firstArrayMap.keySet()) {              
        
        if(secondArrayMap.containsKey(key))
        {   int value=Math.min(firstArrayMap.get(key),secondArrayMap.get(key));
           
         for(int i=0;i<value;i++)
            {list.add(key);}         

       }
       }
        
        
      int arr[] = new int[list.size()];
      int counter=0;
      for(int val:list)
      {
          arr[counter++]=val;
      }
       
    
        return arr;

        
        
        
        
        
        /*     int min= Math.min(nums1.length,nums2.length);
        int arr[]= new int[min];
        int k=0;
        
        
        
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    arr[k]=nums1[i];
                    k++;
                }
            }
        }
        
        return arr; */
    }
}