import java.util.*;

class Graph {
    int V;
    List<List<Integer>> adjlist;

    public Graph(int V) {
        this.V = V;
        adjlist = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            adjlist.add(new ArrayList<>());
        }

    }


    
}

public class GraphTraversal {

    public static void main(String[] args) {

    }

}