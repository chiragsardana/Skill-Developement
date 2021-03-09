package Greedy;

import java.util.Arrays;

public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(9,28);
		graph.addEdge(new Edge(0,1,4));
		graph.addEdge(new Edge(1,0,4));
		graph.addEdge(new Edge(0,7,8));
		graph.addEdge(new Edge(7,0,8));
		graph.addEdge(new Edge(1,2,8));
		graph.addEdge(new Edge(2,1,8));
		graph.addEdge(new Edge(1,7,8));
		graph.addEdge(new Edge(7,1,8));
		graph.addEdge(new Edge(2,3,7));
		graph.addEdge(new Edge(3,2,7));
		graph.addEdge(new Edge(2,5,4));
		graph.addEdge(new Edge(5,2,4));
		graph.addEdge(new Edge(2,8,2));
		graph.addEdge(new Edge(8,2,2));
		graph.addEdge(new Edge(3,4,9));
		graph.addEdge(new Edge(4,3,9));
		graph.addEdge(new Edge(3,5,14));
		graph.addEdge(new Edge(5,3,14));
		graph.addEdge(new Edge(4,5,10));
		graph.addEdge(new Edge(5,4,10));
		graph.addEdge(new Edge(5,6,2));
		graph.addEdge(new Edge(6,5,2));
		graph.addEdge(new Edge(6,8,6));
		graph.addEdge(new Edge(8,6,6));
		graph.addEdge(new Edge(6,7,1));
		graph.addEdge(new Edge(7,6,1));
		graph.addEdge(new Edge(7,8,7));
		graph.addEdge(new Edge(8,7,7));
		dijkstra(graph.getAdjancencyMatrix(), 0);
	}
	public static void dijkstra(Integer[][] adjancencyMatrix, Integer start) {
		Integer[] distance = new Integer[adjancencyMatrix.length];
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
		Arrays.fill(visited, false);
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;
		for(Integer i = 0;i < adjancencyMatrix.length - 1;i++) {
			Integer minWeightIndex = minimumWeightIndex(distance, visited);
			visited[minWeightIndex] = true;
			for(Integer j = 0;j < adjancencyMatrix.length;j++) {
				if(!visited[j] && adjancencyMatrix[minWeightIndex][j] != 0 &&
						distance[minWeightIndex] != Integer.MAX_VALUE &&
						distance[minWeightIndex] + 
						adjancencyMatrix[minWeightIndex][j] < distance[j] ) {
					distance[j] = distance[minWeightIndex] + adjancencyMatrix[minWeightIndex][j];
				}
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
	public static Integer minimumWeightIndex(Integer[] key, Boolean[] visited) {
		Integer minWeightIndex = -1;
		Integer min = Integer.MAX_VALUE;
		for(Integer i = 0;i < key.length;i++) {
			if(!visited[i] && key[i] < min) {
				minWeightIndex = i;
				min = key[i];
			}
		}
		return minWeightIndex;
	}
}
