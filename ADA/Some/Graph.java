package Some;

import java.util.LinkedList;

public class Graph {
	// Number of vertices in the graph 
    int V; 

    // List of adjacent nodes of a given vertex 
    LinkedList<Node1>[] adj; 

    // Constructor 
    Graph(int e) 
    { 
        V = e; 
        adj = new LinkedList[V]; 
        for (int o = 0; o < V; o++) 
            adj[o] = new LinkedList<>(); 
    }
    void addEdge(Graph graph, int src, int dest, int weight) 
    { 
  
        Node1 node0 = new Node1(dest, weight); 
        Node1 node = new Node1(src, weight); 
        graph.adj[src].addLast(node0); 
        graph.adj[dest].addLast(node); 
    }
}
