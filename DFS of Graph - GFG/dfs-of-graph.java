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
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    ArrayList<Integer> list= new ArrayList<>();

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        
        dfs(adj,0,visited,list);
        // calling dfs function with source as 0
        return list;
    }
    
    
    public void dfs(ArrayList<ArrayList<Integer>> adj,int src, boolean[] visited,ArrayList<Integer> list)
    {
        visited[src]=true;
        list.add(src);
        
        for(int j: adj.get(src))
        {
            if(visited[j]==false)
            {dfs(adj,j,visited,list);}
        }
        
    }
    
    
    
    
  /*  public static void dfs(List<Integer> list, Boolean[] visited, int i,ArrayList<ArrayList<Integer>> adj)
    {   
        
        visited[i]=true;
        list.add(i);
        
        for(int value:list)
        {
    
           dfs(adj.get(value),visited, value, adj);

        }

    }*/
    
    
    
    
    
}