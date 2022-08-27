class Solution {
    public boolean containsDuplicate(int[] nums) {
   
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int counter=0;counter<nums.length;counter++){
            if(set.contains(nums[counter])){
            return true;
        }
            else{
            set.add(nums[counter]);
        }
        }
    return false;
    }
}