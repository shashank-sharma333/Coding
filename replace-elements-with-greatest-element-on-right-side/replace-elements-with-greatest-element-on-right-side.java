class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] result=arr;
        int length=result.length-1;
        int maximum=result[length];
        result[length]=-1;
        
        for(int counter=length-1;counter>=0;counter--)
        {
            int value=result[counter];
            result[counter]=maximum;
            if(value>maximum)
            {
                maximum=value;
            }         
        }
        
        return result;
        
    }
}