package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(4,6);
		graph.addEdge(new Edge(0,1,1));
		graph.addEdge(new Edge(1,0,1));
		graph.addEdge(new Edge(0,2,1));
		graph.addEdge(new Edge(2,0,1));
		graph.addEdge(new Edge(1,3,1));
		graph.addEdge(new Edge(3,1,1));
		ArrayList<Integer> list = bfsTraversal(graph.getAdjancencyMatrix(),0);
		System.out.println(list);
	}
	public static ArrayList<Integer> bfsTraversal(Integer[][] adjancencyMatrix, Integer start){
		ArrayList<Integer> BFS = new ArrayList<>();
		Boolean[] visited = new Boolean[adjancencyMatrix.length];
        Arrays.fill(visited, false);
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			Integer value = queue.poll();
			BFS.add(value);
			for(Integer i = 0; i < adjancencyMatrix.length;i++) {
				if(adjancencyMatrix[value][i] == 1 && (!visited[i])) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		
		return BFS;
	}

}
