//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        
        HashMap<Integer,Integer> prefixSum= new HashMap<>();
        int sum=0;
        int max=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            if(sum==0)
            {
                max=i+1;
            }
            
            else{
                if(prefixSum.get(sum)!=null)
                {
                    /*idea is if a prefix sum remains same for two indexes, 
                    then the portion between them is zero*/
                    max=Math.max(max,i-prefixSum.get(sum));
                }
                else{
                    prefixSum.put(sum,i);
                }
            }
            
        }
        
        return max;
    }
}