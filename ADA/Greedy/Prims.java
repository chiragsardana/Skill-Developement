package Greedy;

import java.util.Arrays;
import java.util.List;

public class Prims {
	public static void main(String[] args) {
		Graph graph = new Graph(9,28);
		graph.addEdge(new Edge(0,1,4));
		graph.addEdge(new Edge(1,0,4));
		graph.addEdge(new Edge(0,7,8));
		graph.addEdge(new Edge(7,0,8));
		graph.addEdge(new Edge(1,2,8+1));
		graph.addEdge(new Edge(2,1,8+1));
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
		graph = prims(graph.getAdjancencyMatrix(), 0);
//		System.out.println(graph.getList());
//		List<Edge> list = graph.getList();
//		for(Integer i = 0;i < list.size();i++) {
//			System.out.println(list.get(i).getSource()+" to "+list.get(i).getDestination()+" = "+list.get(i).getWeight());
//		}
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
	public static Graph prims(Integer[][] adjancencyMatrix, Integer start) {
		Graph graph = new Graph(adjancencyMatrix.length, adjancencyMatrix.length -1);
		Integer[] key = new Integer[adjancencyMatrix.length];
		Integer[] from = new Integer[adjancencyMatrix.length];
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
		Arrays.fill(key, Integer.MAX_VALUE);
		Arrays.fill(visited, false);
		key[start] = 0;
		for(Integer i = 0;i < adjancencyMatrix.length - 1;i++) {
			Integer minWeightIndex = minimumWeightIndex(key, visited);
			
			visited[minWeightIndex] = true;
			for(Integer j = 0;j < adjancencyMatrix.length ;j++) {
				if (adjancencyMatrix[minWeightIndex][j] != 0 && visited[j] == false && adjancencyMatrix[minWeightIndex][j] < key[j]) {
					from[j] = minWeightIndex;
	                key[j] = adjancencyMatrix[minWeightIndex][j]; 
//	                graph.addEdge(new Edge(minWeightIndex,j, adjancencyMatrix[minWeightIndex][j]));
	            }
			}
			
		}
		Integer minCost = 0;
		for(Integer i = 1;i < from.length;i++) {
			System.out.println(from[i]+" to "+i+" = "+adjancencyMatrix[i][from[i]]);
			minCost += adjancencyMatrix[i][from[i]];
		}
		System.out.println("The Minimum Cost is: "+minCost);
//		System.out.println(graph.getList());
		return graph;
	}
}
