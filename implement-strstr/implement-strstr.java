class Solution {
    public int strStr(String haystack, String needle) {
       
        return haystack.indexOf(needle);
        
        /*
        
       Solving using substring way 
        for(int outerCounter=0;outerCounter<haystack.length();outerCounter++)
        {
            for(int innerCounter=outerCounter+1;innerCounter<=haystack.length();innerCounter++)
            {
                if((haystack.substring(outerCounter,innerCounter)).equals(needle))
                {
                    return outerCounter;
                }
                
            }
        
        }
        
        return -1;   */
    }
}