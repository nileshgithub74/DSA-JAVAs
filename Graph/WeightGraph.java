package Graph;

import java.util.*;

class Solution {
    public List<List<int[]>> printGraph(int V, int edges[][]) {
        List<List<int[]>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(new int[]{edge[1], edge[2]});
            adjList.get(edge[1]).add(new int[]{edge[0], edge[2]});
        }
        
        return adjList;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {
            {0, 1, 2},
            {0, 4, 5},
            {1, 2, 1},
            {1, 3, 3},
            {1, 4, 2},
            {2, 3, 4},
            {3, 4, 1}
        };
        
        Solution solution = new Solution();
        List<List<int[]>> adjList = solution.printGraph(V, edges);
        
        System.out.println("Weighted Adjacency List:");
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int[] pair : adjList.get(i)) {
                System.out.print("(" + pair[0] + ", " + pair[1] + ") ");
            }
            System.out.println();
        }
    }
}
