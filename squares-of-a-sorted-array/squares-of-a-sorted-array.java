class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] squares= nums.clone();
        
        for(int counter=0;counter<nums.length;counter++)
        {
            squares[counter]= squares[counter]*squares[counter];
        }
        
        Arrays.sort(squares);
        
        return squares;
    }
}