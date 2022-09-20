class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
	Map<Integer, Boolean> value = new HashMap<Integer, Boolean>();
    Set<Integer> set= new HashSet<Integer>();
    
    for(int counter=0;counter<nums1.length;counter++)
    {
        value.put(nums1[counter],true);
    }
        
     
    for(int counter=0;counter<nums2.length;counter++)
    {
        if(value.containsKey(nums2[counter]))
        {
            set.add(nums2[counter]);
        }
    }
        
    int arr[]= new int[set.size()];
        
   // arr= set.toArray(arr);
        int i=0;
     // iterating over the hashset
        for(int ele:set){
          arr[i++] = ele;
        }
        
    return arr;
        
    }
}