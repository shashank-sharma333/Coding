class Solution {
    public boolean isPalindrome(String test) {
        
        String testSmallCase = test.toLowerCase();

		testSmallCase = testSmallCase.replaceAll("[^a-zA-Z0-9]", "");

		StringBuilder reverse = new StringBuilder(testSmallCase);

		if(testSmallCase.equals(reverse.reverse().toString()))
        {
            return true;
        }
        
        else{
            return false;
        }
      
    }
}