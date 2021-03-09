package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(4,6);
		graph.addEdge(new Edge(0,1,1));
		graph.addEdge(new Edge(1,0,1));
		graph.addEdge(new Edge(0,2,1));
		graph.addEdge(new Edge(2,0,1));
		graph.addEdge(new Edge(1,3,1));
		graph.addEdge(new Edge(3,1,1));
		detectCycle(graph.getAdjancencyMatrix(),0);
	}
	public static Boolean detectCycle(Integer[][] adjancencyMatrix, Integer start){
		return true;
	}
}
