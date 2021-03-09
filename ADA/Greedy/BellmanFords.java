package Greedy;

import java.util.Arrays;
import java.util.List;

public class BellmanFords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No Negative Edge Cycle
//		Graph graph = new Graph(9,28);
//		graph.addEdge(new Edge(0,1,4));
//		graph.addEdge(new Edge(1,0,4));
//		graph.addEdge(new Edge(0,7,8));
//		graph.addEdge(new Edge(7,0,8));
//		graph.addEdge(new Edge(1,2,8));
//		graph.addEdge(new Edge(2,1,8));
//		graph.addEdge(new Edge(1,7,8));
//		graph.addEdge(new Edge(7,1,8));
//		graph.addEdge(new Edge(2,3,7));
//		graph.addEdge(new Edge(3,2,7));
//		graph.addEdge(new Edge(2,5,4));
//		graph.addEdge(new Edge(5,2,4));
//		graph.addEdge(new Edge(2,8,2));
//		graph.addEdge(new Edge(8,2,2));
//		graph.addEdge(new Edge(3,4,9));
//		graph.addEdge(new Edge(4,3,9));
//		graph.addEdge(new Edge(3,5,14));
//		graph.addEdge(new Edge(5,3,14));
//		graph.addEdge(new Edge(4,5,10));
//		graph.addEdge(new Edge(5,4,10));
//		graph.addEdge(new Edge(5,6,2));
//		graph.addEdge(new Edge(6,5,2));
//		graph.addEdge(new Edge(6,8,6));
//		graph.addEdge(new Edge(8,6,6));
//		graph.addEdge(new Edge(6,7,1));
//		graph.addEdge(new Edge(7,6,1));
//		graph.addEdge(new Edge(7,8,7));
//		graph.addEdge(new Edge(8,7,7));
		
		//Negative Edge Cycle
		Graph graph = new Graph(4,5);
		graph.addEdge(new Edge(0,1,5));
		graph.addEdge(new Edge(0,2,4));
		graph.addEdge(new Edge(1,3,3));
		graph.addEdge(new Edge(2,1,-6));
		graph.addEdge(new Edge(3,2,2));
		bellmanFord(graph, 0);
	}
	public static void bellmanFord(Graph graph, Integer start) {
		Integer[] distance = new Integer[graph.getVertices()];
		Arrays.fill(distance,  Integer.MAX_VALUE);
		distance[start] = 0;
		List<Edge> edge = graph.getList();
		for(Integer i = 0;i < graph.getVertices() - 1;i++) {
//			dist[v] > dist[u] + weight of edge uv
//			dis[graph[j][0]] + graph[j][2] <
//            dis[graph[j][1]])
			for(Integer j = 0;j < graph.getEdges();j++) {
				if(distance[edge.get(j).getSource()] + edge.get(j).getWeight() <
                        distance[edge.get(j).getDestination()]) {
					distance[edge.get(j).getDestination()] = distance[edge.get(j).getSource()] + edge.get(j).getWeight();
				}
			}
		}
		for(Integer j = 0;j < graph.getEdges();j++) {
			if(distance[edge.get(j).getSource()] + edge.get(j).getWeight() <
                    distance[edge.get(j).getDestination()]) {
				System.out.println("Graph Contains Negative Edge Cycle.");
			}
		}
		printShortestPath(start, distance);
	}
	public static void printShortestPath(Integer start,Integer[] distance) {
		System.out.println("The Shortest Path From Given Source.");
		for(Integer i = 0;i < distance.length;i++) {
			System.out.println(start+" to "+i+" = "+distance[i]);
		}
	}
}
