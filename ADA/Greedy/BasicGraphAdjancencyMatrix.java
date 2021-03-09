package Greedy;


public class BasicGraphAdjancencyMatrix {
	public static void main(String[] args) {
//		Graph graph = new Graph(9, 14);
//		graph.addEdge(new Edge(0, 1, 4));
//		graph.addEdge(new Edge(0, 7, 8));
//		graph.addEdge(new Edge(1, 2, 8));
//		graph.addEdge(new Edge(1, 7, 11));
//		graph.addEdge(new Edge(7, 8, 7));
//		graph.addEdge(new Edge(7, 6, 1));
//		graph.addEdge(new Edge(2, 8, 2));
//		graph.addEdge(new Edge(2, 3, 7));
//		graph.addEdge(new Edge(2, 5, 4));
//		graph.addEdge(new Edge(8, 6, 6));
//		graph.addEdge(new Edge(6, 5, 2));
//		graph.addEdge(new Edge(3, 5, 14));
//		graph.addEdge(new Edge(3, 4, 9));
//		graph.addEdge(new Edge(5, 4, 10));

		
		Graph graph = new Graph(4,6);
		graph.addEdge(new Edge(0,1,1));
		graph.addEdge(new Edge(1,0,1));
		graph.addEdge(new Edge(0,2,1));
		graph.addEdge(new Edge(2,0,1));
		graph.addEdge(new Edge(1,3,1));
		graph.addEdge(new Edge(3,1,1));
		
//		Graph graph = new Graph(7,24);
//		graph.addEdge(new Edge(0,1,1));
//		graph.addEdge(new Edge(0,3,1));
//		graph.addEdge(new Edge(1,0,1));
//		graph.addEdge(new Edge(1,2,1));
//		graph.addEdge(new Edge(1,3,1));
//		graph.addEdge(new Edge(1,5,1));
//		graph.addEdge(new Edge(1,6,1));
//		graph.addEdge(new Edge(2,1,1));
//		graph.addEdge(new Edge(2,3,1));
//		graph.addEdge(new Edge(2,4,1));
//		graph.addEdge(new Edge(2,5,1));
//		graph.addEdge(new Edge(3,4,1));
//		graph.addEdge(new Edge(3,2,1));
//		graph.addEdge(new Edge(3,0,1));
//		graph.addEdge(new Edge(3,1,1));
//		graph.addEdge(new Edge(4,2,1));
//		graph.addEdge(new Edge(4,3,1));
//		graph.addEdge(new Edge(4,6,1));
//		graph.addEdge(new Edge(5,1,1));
//		graph.addEdge(new Edge(5,2,1));
//		graph.addEdge(new Edge(5,6,1));
//		graph.addEdge(new Edge(6,1,1));
//		graph.addEdge(new Edge(6,4,1));
//		graph.addEdge(new Edge(6,5,1));
		Integer[][] arr = graph.getAdjancencyMatrix();
		displayAdjancencyMatrix(arr);
	}
	public static void displayAdjancencyMatrix(Integer[][] arr) {
		System.out.println("The Adjacency Matrix of the Graph: ");
		for(Integer i = 0;i < arr.length;i++) {
			for(Integer j = 0;j < arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
