class Solution {
    public int heightChecker(int[] heights) {
     
        int original[] = new int[heights.length];

        original=heights.clone();
		Arrays.sort(heights);

		int countNotEqual = 0;

		for (int counter = 0; counter < original.length; counter++) {

			if (original[counter] != heights[counter]) {
				countNotEqual++;
			}
		}
        
        return countNotEqual;
    }
}