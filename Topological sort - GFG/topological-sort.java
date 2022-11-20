//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
    
    int ingress[] = new int[V];
      
    Arrays.fill(ingress,0);
      
    for(int i=0;i<V;i++)
    {
        for(int j: adj.get(i))
        {
            ingress[j]++;
        }
    }
        
    Queue<Integer> queue= new LinkedList<Integer>();
    
    for(int i=0;i<ingress.length;i++)
    {
        if(ingress[i]==0)
        {
            queue.add(i);
        }
    }
    
    ArrayList<Integer> numbers= new ArrayList<Integer>();
    while(!queue.isEmpty())
    {
       int val= queue.poll();
       numbers.add(val);
       
       for(int j:adj.get(val))
       {
           ingress[j]--;
           if(ingress[j]==0)
           {
               queue.add(j);
           }
       }
    }
    
    if(numbers.size()!=V)
    {
        return new int[0];
    }
    
    int[] answer= new int[numbers.size()];
    
    int i=0;
    for(int val: numbers)
    {
      answer[i]= val;
      i++;
    }
    
     
     return answer;
    }
    
}
