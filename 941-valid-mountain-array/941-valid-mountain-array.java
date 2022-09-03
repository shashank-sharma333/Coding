class Solution {
    public boolean validMountainArray(int[] arr) {
      
        int N = arr.length;
        int i = 0;

        // walk up
        while (i+1 < N && arr[i] < arr[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && arr[i] > arr[i+1])
            i++;

        return i == N-1;
    }
        
        
        
     /*   boolean increase=true;
        boolean decrease=false;
            
        if(arr.length<3)
        {
            return false;
        }
        
        for(int counter=1;counter<arr.length;counter++)
        {
           if((arr[counter]==arr[counter-1]) )
            {   
               return false;
            }
            
            if((arr[counter]>arr[counter-1]) )
            {   increase=true;
                decrease=false;
            }
    
            else{
                decrease=true;
                increase=false;
            }            
        }
        
        if(decrease==true)
        {
            return true;
        }
        
        return false;
        
    }*/
}