package Some;


class Chirag19CSU071 {
	static boolean isValidEdge(int u, int v, 
            boolean[] inMST) 
{ 
if (u == v) 
return false; 
if (inMST[u] == false && inMST[v] == false) 
return false; 
else if (inMST[u] == true && inMST[v] == true) 
return false; 
return true; 
} 

	static void primMST(int cost[][]) 
	{  
		Integer V = cost.length;
		boolean []inMST = new boolean[V]; 
		
		// Include first vertex in MST 
		inMST[0] = true; 
		
		// Keep adding edges while number of included 
		// edges does not become V-1. 
		int edge_count = 0, mincost = 0; 
		while (edge_count < V - 1) 
		{ 
		
			// Find minimum weight valid edge.  
			int min = Integer.MAX_VALUE, a = -1, b = -1; 
			for (int i = 0; i < V; i++)  
			{ 
				for (int j = 0; j < V; j++)  
				{              
				 if (cost[i][j] < min)  
				 { 
				     if (isValidEdge(i, j, inMST))  
				     { 
				         min = cost[i][j]; 
				         a = i; 
				         b = j; 
				     } 
				 } 
				} 
			} 
				
			if (a != -1 && b != -1)  
			{ 
				System.out.printf("Edge %d:(%d, %d) cost: %d \n",  
				                     edge_count++, a, b, min); 
				mincost = mincost + min; 
				inMST[b] = inMST[a] = true; 
			} 
		} 
		System.out.printf("\n Minimum cost = %d \n", mincost); 
	}

    public static void main(String[] args) {
        Chirag19CSU071 g = new Chirag19CSU071();
        int V = 5;
        int G[][] = {{ Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 6, Integer.MAX_VALUE }, 
                { 2, Integer.MAX_VALUE, 3, 8, 5 }, 
                { Integer.MAX_VALUE, 3, Integer.MAX_VALUE, Integer.MAX_VALUE, 7 }, 
                { 6, 8, Integer.MAX_VALUE, Integer.MAX_VALUE, 9 }, 
                { Integer.MAX_VALUE, 5, 7, 9, Integer.MAX_VALUE }};
        primMST(G);
    }
}
/*
Edge 0:(0, 1) cost: 2 
Edge 1:(1, 2) cost: 3 
Edge 2:(1, 4) cost: 5 
Edge 3:(0, 3) cost: 6 

 Minimum cost = 16 
*/
