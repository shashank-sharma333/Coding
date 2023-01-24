//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {   
        
        Arrays.sort(arr, (a,b)->(b.profit-a.profit));
        
        int maxDeadline=0;
        for(Job a:arr)
        {
            if(a.deadline>maxDeadline)
            {
                maxDeadline=a.deadline;
            }
        }
        
        
        
        int[] values= new int[maxDeadline+1];
        Arrays.fill(values,-1);
        
        // for(Job a:arr)
        // {
        //     // if(values[a.deadline]!=-1)
        //     // {
        //     //   if(values[a.deadline]<a.deadline)
        //     //   {
        //     //       values[a.deadline]=a.deadline;

        //     //   }
        //     // }
        //     // else{
            
        // if(values[a.deadline]==-1)
        // {values[a.deadline]=a.deadline;}
            
        // }
        
        int countJobs=0;
        int jobProfit=0;
        
    for(int i=0;i<n;i++)
   { 
       for (int j = arr[i].deadline; j > 0; j--) {

            // Free slot found 
            if (values[j] == -1) {
               values[j] = i;
               countJobs++;
               jobProfit += arr[i].profit;
               break;
            }
         }
    }
    
    
        
        // for(int val:values)
        // {
        //     System.out.println("  "+ val);
            
        //     if(val!=-1)
        //     {
        //         count++;
        //         maxProfit=maxProfit+arr[val-1].profit;
        //          System.out.println("pr"+arr[val-1].profit);
        //     }
        // }
        
        int[] final1= new int[2];
        
        final1[0]=countJobs;
        final1[1]=jobProfit;
        
        return final1;
        
        /*int maxDeadline=0;
        Map<Integer,Integer> value= new TreeMap<>();
        for(Job job:arr)
        {
            if(!value.containsKey(job.deadline))
            {value.put(job.deadline,job.profit);}
            
            else{
                if(value.get(job.deadline)<job.profit)
                {
                    value.put(job.deadline,job.profit);
                }
            }
            
            maxDeadline=Math.max(job.deadline, maxDeadline);
        }
        
        int maxProfit=0;
        int countOfTasks=0;
        
       for (Map.Entry<Integer,Integer> entry : value.entrySet()) 
        {    
            maxProfit=maxProfit+entry.getValue();
            countOfTasks++;
        }
    
   
      int[] v= new int[2];
      v[0]=countOfTasks;
      v[1]=maxProfit;
      
      return v;*/
    }
        
    }

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/