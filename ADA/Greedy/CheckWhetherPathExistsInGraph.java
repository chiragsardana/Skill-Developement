package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheckWhetherPathExistsInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(9,8);
//		graph.addEdge(new Edge(0,1,1));
//		graph.addEdge(new Edge(1,0,1));
//		graph.addEdge(new Edge(0,2,1));
//		graph.addEdge(new Edge(2,0,1));
//		graph.addEdge(new Edge(1,3,1));
//		graph.addEdge(new Edge(3,1,1));
		graph.addEdge(new Edge(2,8,2));
		graph.addEdge(new Edge(8,2,2));
		graph.addEdge(new Edge(2,5,4));
		graph.addEdge(new Edge(5,2,4));
		graph.addEdge(new Edge(5,6,2));
		graph.addEdge(new Edge(6,5,2));
		graph.addEdge(new Edge(7,6,1));
		graph.addEdge(new Edge(6,7,2));
		Integer[][] arr = graph.getAdjancencyMatrix();
		BasicGraphAdjancencyMatrix obj = new BasicGraphAdjancencyMatrix();
		obj.displayAdjancencyMatrix(arr);
		
		System.out.println("\nThe Graph contains path"
				+ "from 8 to 6: "+checkPath(graph.getAdjancencyMatrix(), 8, 6));
	}
	public static Boolean checkPath(Integer[][] adjancencyMatrix, Integer start, Integer end) {
		Queue<Integer> queue = new LinkedList<>();
		ArrayList<Integer> BFS = new ArrayList<>();
		queue.add(start);
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
		Arrays.fill(visited, false);
		visited[start] = true;
		while(!queue.isEmpty()) {
			Integer value = queue.poll();
			BFS.add(value);
			for(Integer i = 0;i < adjancencyMatrix.length;i++) {
				if(adjancencyMatrix[value][i] != 0 && (!visited[i])) {
					queue.add(i);
					visited[i] = true;
				}
			}
			
		}
		if(BFS.contains(end)) {
			return true;
		}
		return false;
	}

}
