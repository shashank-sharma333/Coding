//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                // adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    ArrayList<Integer> list= new ArrayList<Integer>();
    Queue<Integer> pq = new LinkedList<>();
    
   // Queue<Integer> numbers= new Queue<Integer>();
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        pq.add(0);
        visited[0]=true;
        
       while(!pq.isEmpty())
       {
           Integer val=pq.poll();
           list.add(val);
           
           for(int j: adj.get(val))
           {
               if(!visited[j])
               {
                   visited[j]=true;
                   pq.add(j);
               }
           }
       }
        
        return list;
    }
    
  /*  public void bfs(ArrayList<ArrayList<Integer>> adj, int src,int n, ArrayList<Integer> list,boolean [] visited)
    {
       pq.add(src);
       list.add(src);
       for(int nbr: adj.get(src))
        {
            pq.add(nbr);
            if(visited[nbr]==false)
            {
                bfs(adj,nbr,n,list, visited);
            }
        }
       
    }*/
    

}