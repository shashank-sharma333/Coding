class Solution {
    public int reverse(int x) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        String reverseNumber = sb.toString();
        
        Boolean isNegative=false;

        if (reverseNumber.startsWith("-")) {
            isNegative=true;
			reverseNumber = reverseNumber.substring(1, (reverseNumber.length()));
			System.out.println(reverseNumber);
		}
       
       
        StringBuilder rev = new StringBuilder(reverseNumber);

        
        reverseNumber = rev.reverse().toString();
    
        if(isNegative)
        {
            reverseNumber="-"+reverseNumber;
        }
        

	    if (Double.valueOf(reverseNumber) > Integer.MAX_VALUE || Double.valueOf(reverseNumber) < Integer.MIN_VALUE) {
			return 0;}

		else {
			return Integer.valueOf(reverseNumber);
		}
    }
    
}