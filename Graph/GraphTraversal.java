package Graph;

import java.util.*;

public class GraphTraversal {
    static void dfs(int u, ArrayList<Integer>[] adj, boolean[] vis) {
        if (vis[u]) return; 
        vis[u] = true;
        System.out.print(u + " "); 

        for (int v : adj[u]) {
            dfs(v, adj, vis);
        }
    }

    public static void main(String[] args) {



        int n = 5; 
        ArrayList<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        
        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(3);
        adj[1].add(4);

        boolean[] vis = new boolean[n];

        System.out.println("DFS Traversal:");
        dfs(0, adj, vis); 
    }
}
