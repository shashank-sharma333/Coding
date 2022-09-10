class Solution {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int counter=0;counter<n;counter++)
        {
            nums1[m+counter]=nums2[counter];
        }
        
        Arrays.sort(nums1);     
    }
}