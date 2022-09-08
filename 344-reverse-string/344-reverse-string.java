class Solution {
    public void reverseString(char[] s) {
        
        StringBuilder sb= new StringBuilder(new String(s));
		
		String str= sb.reverse().toString();

        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
    
    }
}