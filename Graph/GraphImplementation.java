
// public class GraphImplementation {

//     // int[][] adjMatrix;
//     // int V;
//     // int weight;

//     // GraphImplementation(int V) {
//     //     this.V = V;
//     //     adjMatrix = new int[V][V];

//     // }

//     // public void addEdges(int[][] edges) {
//     //     for (int edge[] : edges) {
//     //         int u = edge[0];
//     //         int v = edge[1];

//     //         /// for directed graph
//     //         /// 

//     //         adjMatrix[u][v] = 1;

//     //         // for undirected graph
//     //         // adjMatrix[u][v] = 1;
//     //         // adjMatrix[v][u] = 1;

//     //     }

//     // }

//     // public void addEdgesWithWeight(int[][] edges) {
//     //     for (int edge[] : edges) {
//     //         int u = edge[0];
//     //         int v = edge[1];
//     //         int w = edge[2];

//     //         /// for directed graph
//     //         /// 

//     //         adjMatrix[u][v] = w;

//     //         // for undirected graph
//     //         // adjMatrix[u][v] = 1;
//     //         // adjMatrix[v][u] = 1;

//     //     }

//     // }

//     // public void printMatrix() {
//     //     for (int[] row : adjMatrix) {

//     //         for (int j : row) {
//     //             System.out.print(j + " ");
//     //         }

//     //         System.out.println();
//     //     }
//     // }

//     // public static void main(String[] args) {
//     //     int edges[][] = { { 0, 2, 10 }, { 0, 1, 20 }, { 1, 3, 20 } };
//     //     int V = 4;

//     //     GraphImplementation graph = new GraphImplementation(V);

//     //     // graph.addEdges(edges);
//     //     graph.addEdgesWithWeight(edges);

//     //     graph.printMatrix();

//     // }

// }


 import java.util.*;

public class GraphImplementation {
    int V;
    List<List<Integer>> adjlist;

    GraphImplementation(int V){
        this.V = V;
        adjlist = new ArrayList<>(V);

        for(int i =0;i < V; i++){
            adjlist.add(new ArrayList<>());
        }

    }

    public void addEdges(int[][] edges){

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            //for directed 

            adjlist.get(u).add(v);



         }

    }

    public void PrintList(){
       for(int i =0; i < adjlist.size(); i++){
        System.out.print(i+ "->");
        for(int j =0; j< adjlist.get(i).size(); j++){
            System.out.print(adjlist.get(i).get(j)+ " ");
        }
        System.out.println();
       }
    }
    public static void main(String[] args) {
           int V = 5;
        int[][] edges = { {0,1}, {0,4}, {1,2}, {1,3}, {1,4}, {2,3}, {3,4} };

        GraphImplementation graph = new GraphImplementation(V);
        graph.addEdges(edges);

        graph.PrintList();
    }

}