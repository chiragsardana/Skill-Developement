package AssigmentByAyush;
/*
Find the minimum cost spanning tree of a given directed weighted 
graph using Kruskal’s algorithm. (CO3)

DoDs:
a.	Program should ask the user to enter edge weights and 
	prompt the user to enter again if the entered edge weight is negative.
	
b.	Program should print the minimum cost edges along with their total sum.

c.	Finally, print the total elapsed time. 
*/

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Directed Graph
		System.out.println("Program Started!!!");
		Long startTime = System.nanoTime();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of Vertices: ");
		Integer vertices = input.nextInt();
		
		System.out.print("Enter the Number of Directed Edges: ");
		Integer edges = input.nextInt();
		
		Graph graph = new Graph(vertices, edges);
		
		for(Integer i = 0;i < edges;i++) {
			System.out.print("Enter the Source: ");
			Integer src = input.nextInt();
			while(src >= vertices || src < 0) {
				System.out.print("Enter the Correct Source: ");
				src = input.nextInt();
			}
			System.out.print("Enter the Destination: ");
			Integer dst = input.nextInt();
			while(dst >= vertices || dst < 0) {
				System.out.print("Enter the Correct Destination: ");
				dst = input.nextInt();
			}
			System.out.print("Now Enter the Weight of Edge: ");
			Integer weight = input.nextInt();
			while(weight < 0) {
				System.out.print("Enter the Weight of Edge in Positive: ");
				weight = input.nextInt();
			}
			graph.addEdge(new Edge(src,dst,weight));
		}
		
//		graph.addEdge(new Edge(0,1,4));
//		graph.addEdge(new Edge(0,5,5));
//		graph.addEdge(new Edge(1,2,2));
//		graph.addEdge(new Edge(1,6,1));
//		graph.addEdge(new Edge(2,3,10));
//		graph.addEdge(new Edge(2,6,3));
//		graph.addEdge(new Edge(3,4,6));
//		graph.addEdge(new Edge(4,5,1));
//		graph.addEdge(new Edge(6,0,2));
//		graph.addEdge(new Edge(6,3,2));
//		graph.addEdge(new Edge(6,4,4));
//		graph.addEdge(new Edge(6,5,8));
		graph = kruskal(graph.getList(), vertices);
		System.out.print("The Minimum Costing for MST: ");
		Integer minimumCost = 0;
		List<Edge> list = graph.getList();
		for(Integer i = 0;i < list.size();i+=2) {
			minimumCost += list.get(i).getWeight();
		}
		System.out.println(minimumCost);
		for(Integer i = 0;i < list.size();i+=2) {
			System.out.println(list.get(i).getSource()+" to "+list.get(i).getDestination()+" = "+list.get(i).getWeight());
		}
		Long endTime = System.nanoTime();
		
		System.out.println("Total Time Taken by the Execution: "+ (endTime-startTime)+" nano seconds");
	}
	public static Graph kruskal(List<Edge> list, Integer v) {
		Graph graph = new Graph(v,2*v-2);
		Collections.sort(list, new KruskalComparator());
		CheckWhetherPathExistsInGraph check = new CheckWhetherPathExistsInGraph();
		for(Integer i = 0;i < list.size();i+=2) {
			if(!CheckWhetherPathExistsInGraph.checkPath(graph.getAdjancencyMatrix(), list.get(i).getDestination(), list.get(i).getSource())) {
				graph.addEdge(list.get(i));
				graph.addEdge(list.get(i+1));
			}
		}
		return graph;
	}

}
