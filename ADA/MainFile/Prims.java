package MainFile;

public class Prims {
	public static void main(String[] args) 
	{  
		Integer graph[][] = new Integer[][] { { 0, 9, 5, 2, 0},{ 9, 0, 0, 6, 5 }, { 5, 0, 0, 4, 5 }, { 2, 6, 4, 0, 4 },{ 0, 5, 5, 4, 0}};  
		prims(graph);
	    //Chirag19CSU071
	}
	public static void prims(Integer graph[][]) {
		//Firstly Remove all the self Loop
		for(Integer i = 0;i < graph.length;i++) {
			graph[i][i] = 0;
		}
		//Secondly remove all the parallel edge of more weight
		
		//But I m already giving Adjacency Matrix with removal of Parallel Edge
		
		//Always choose edge with minimum weight 
		
		//Array Stores Weight
		int key[]=new int[graph.length]; 
		
		int parent[]=new int[graph.length];
		
		for(int i = 0;i < key.length;i++)
		{
			key[i]=Integer.MAX_VALUE;
		}
		key[0] = 0;//Weight From A to A is 0
		
		parent[0] = 0;
		
		//Its to check whether the Node is visited or not
		boolean Mst[]=new boolean[graph.length];
		//As Total Number of Edge is |V|-1
	    for(int count = 1;count < graph.length;count++)
	    {
	    	int u = -1;
	    	int min=Integer.MAX_VALUE;
	    	for(int i = 0;i < graph.length;i++)
	    	{
//	    		0 infin 1 infi infi  
	    		if(!Mst[i] && key[i]<min)
	    		{
	    			min=key[i];
	    			u=i;
	    		}
	    	}
	    	Mst[u]=true;
	    	for(int j=0;j<5;j++)
	    	 {
	    		if(!Mst[j] && graph[u][j] != 0 && graph[u][j] < key[j])
	    		{
	    			key[j]=graph[u][j];
	    			parent[j]=u;
	    		}
	    	 }
	    }
	    //Printing Of Result
	    for(int i = 1;i< graph.length;i++)
		{   
	    	System.out.println(parent[i]+"\t-\t"+(i)+"\t=\t"+ key[i]);
		}
	    int cost=0;
		for(int i = 1;i < graph.length;i++)
		{   
			cost = cost + key[i];
		} 	
	   	System.out.print("Minimum Cost\t\t=\t"+ cost);
		
	}
}
