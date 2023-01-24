//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            
            int arr[] = new int[n];
            int dep[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
              arr[i] = Integer.parseInt(str[i]);
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                dep[i] = Integer.parseInt(str[i]);
                
            System.out.println(new Solution().findPlatform(arr, dep, n));
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {   
        
        
         Arrays.sort(arr); 
        Arrays.sort(dep); 
  
        int plat_needed = 1, result = 1; 
        int i = 1, j = 0; 
  
        while (i < n && j < n) { 
        
            if (arr[i] <= dep[j]) { 
                plat_needed++; 
                i++; 
            } 
  
            else if (arr[i] > dep[j]) { 
                plat_needed--; 
                j++; 
            } 
  
            if (plat_needed > result) 
                result = plat_needed; 
        } 
  
        return result; 
    //     Arrays.sort(arr);
        
    //     Arrays.sort(dep);

    //   /* for(int i=0;i<n;i++)
    //     {
    //       // System.out.println(trains[i][0]+" " +trains[i][1]);
    //     }*/
    //     int i=1;
    //     int j=0;
    //     int platforms=1;
        
    //     while(i<n&&j<n)
    //     {
    //         if(arr[i]>dep[j])
    //         {
    //           platforms--;
    //           j++;
    //         }
    //         else{
    //             platforms++;
    //             i++;
    //         }
            
    //     }
        
    //      if(platforms<1)
    //         {
    //             platforms=1;
    //         }
        
        
    //     return platforms;
        
    }
    
}

