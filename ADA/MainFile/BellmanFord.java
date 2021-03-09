package MainFile;

import Greedy.Edge;
import Greedy.Graph;

public class BellmanFord {

	public static void bellmanFord(Integer graph[][], int V, int E, int src)
	{
		int []dis = new int[V];
		for (int i = 0; i < V; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		
		dis[src] = 0;
		
		for (int i = 0; i < V - 1; i++) 
		{
		
		    for (int j = 0; j < E; j++) 
		    {
		        if (dis[graph[j][0]] != Integer.MAX_VALUE && 
		        			dis[graph[j][0]] + graph[j][2] < dis[graph[j][1]]) {
		        	dis[graph[j][1]] = dis[graph[j][0]] + graph[j][2];
		        }    
		    }
		}
		
		for (int i = 0; i < E; i++) 
		{
		    int x = graph[i][0];
		    int y = graph[i][1];
		    int weight = graph[i][2];
		    if (dis[x] != Integer.MAX_VALUE && dis[x] + weight < dis[y]) {
		    	 System.out.println("Graph contains negative weight cycle");
		    }  
		}
		
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < V; i++)
		    System.out.println(i + "\t\t" + dis[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
	    int E = 8;
	    Graph graph = new Graph(V,E);
	    graph.addEdge(new Edge(0, 1, -1));
	    graph.addEdge(new Edge(0, 2, 4));
	    graph.addEdge(new Edge(1, 2, 3));
	    graph.addEdge(new Edge(1, 3, 2));
	    graph.addEdge(new Edge(1, 4, 2));
	    graph.addEdge(new Edge(3, 2, 5));
	    graph.addEdge(new Edge(3, 1, 1));
	    graph.addEdge(new Edge(4, 3, -3));
	    Integer[][] arr = graph.getAdjancencyMatrix();
	    System.out.println("The Adjancency Matrix for Given Graph is: ");
	    for(Integer i = 0;i < graph.getVertices();i++) {
	    	for(Integer j = 0;j < graph.getVertices();j++) {
	    		System.out.print(arr[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
		bellmanFord(graph.getAdjancencyMatrix(), V, E, 0);
	}

}

//Vertex Distance from Source
//0		0
//1		-1
//2		2
//3		-2
//4		1
