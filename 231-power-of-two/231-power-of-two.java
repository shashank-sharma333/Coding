class Solution {
    public boolean isPowerOfTwo(int n) {
        int count=0;
        while (n > 0) {
			if ((n & 1) > 0) {
				count++;
			}
			n = n >> 1;
		}
        
     if (count==1)
     {
         return true;
     }
     else{
         return false;
     }
    }
}