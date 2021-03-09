package Greedy;

import java.util.Collections;
import java.util.List;

public class Kruskal {

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
		
		
		BasicGraphAdjancencyMatrix dis = new BasicGraphAdjancencyMatrix();
		dis.displayAdjancencyMatrix(graph.getAdjancencyMatrix());
		graph = kruskal(graph.getList(), 9);
		System.out.println(graph.getList());
		dis.displayAdjancencyMatrix(graph.getAdjancencyMatrix());
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
	}
	public static Graph kruskal(List<Edge> list, Integer v) {
		Graph graph = new Graph(v,2*v-2);
		Collections.sort(list, new KruskalComparator());
		System.out.println(list);
		BasicGraphAdjancencyMatrix dis = new BasicGraphAdjancencyMatrix();
		CheckWhetherPathExistsInGraph check = new CheckWhetherPathExistsInGraph();
		for(Integer i = 0;i < list.size();i+=2) {
			if(!CheckWhetherPathExistsInGraph.checkPath(graph.getAdjancencyMatrix(), list.get(i).getDestination(), list.get(i).getSource())) {
//				System.out.println(list.get(i).getDestination()+" to  "+list.get(i).getSource()+" No Path Exist.!!!");
				graph.addEdge(list.get(i));
				graph.addEdge(list.get(i+1));
//				dis.displayAdjancencyMatrix(graph.getAdjancencyMatrix());
			}else {
//				System.out.println(list.get(i).getDestination()+" to  "+list.get(i).getSource()+" Path Exist.!!!");
			}
		}
		return graph;
	}
}
