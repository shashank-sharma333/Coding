class Solution {
    public boolean checkIfExist(int[] arr) {
     
        for(int counter=0;counter<arr.length;counter++)
        {
            for(int innerCounter=counter+1;innerCounter<arr.length;innerCounter++)
            {
                if(arr[innerCounter]==2*arr[counter] || arr[counter]==2*arr[innerCounter])
                {
                    return true;
                }
            }
        }
        
        return false;
        
    }
}