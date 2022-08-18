class Solution {
    public int[] plusOne(int[] digits) {
        
    int length= digits.length;
    for(int counter=length-1; counter>=0; counter--) {
        if(digits[counter] < 9) {
            digits[counter]++; return digits;
        }
        digits[counter] = 0;
    }
    
    int[] newNumber = new int [length+1];
    newNumber[0] = 1;
    return newNumber;
        
    }
}