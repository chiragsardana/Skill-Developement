package LabTest;

import java.util.Arrays;

//A 2D matrix of size m x n is given with random elements. 
//Write a function to sort the array
//column wise. Your algorithm should not have more than the 
//order of O(nxm2)
//).
public class MatrixSortRowWise {
//	static final int MAX_SIZE=10;
    
    // function to sort each row of the matrix
    static void sortByRow(int mat[][], int n)
    {
        for (int i = 0; i < n; i++)
            // sorting row number 'i'
            Arrays.sort(mat[i]);//MlogM Using MErge sort
    }
      
    // function to find transpose of the matrix
    public static int[][] transpose(int mat[][], int m, int n) {
    	int[][] temp = new int[n][m]; 
    	for (int i = 0; i < m; i++) { 
    		for (int j = 0; j < n; j++) { 
    			temp[j][i] = mat[i][j]; 
    		} 
    		
    	} 
    	mat = temp;
//    	System.out.println("");
//    	printMat(mat,3);
    	return temp;
    }
      
    // function to sort the matrix row-wise
    // and column-wise
    static int[][] sortMatRowAndColWise(int mat[][],int m, int n)
    { 
        // get transpose of mat[][]
        mat = transpose(mat, m, n);
        
    	System.out.println("");
    	printMat(mat, n, m);
      
//         again sort rows of mat[][]
        sortByRow(mat, n);
      
    	System.out.println("");
    	printMat(mat,n, m);
        
//         again get transpose of mat[][]
        mat = transpose(mat, n, m);
        
        System.out.println("");
    	printMat(mat, m, n);
    	
    	return mat;
    }
      
    // function to print the matrix
    static void printMat(int mat[][], int m, int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    } 
      
    // Driver code 
    public static void main (String[] args)
    {
        int mat[][] = { { 4, 1, 3,3 },
                        { 9, 6, 8,4 },
                        { 5, 2, 7,4 },
                        {11, 12, 13,14} };
        
        int m = 4;
        int n = 4;
        System.out.print("Original Matrix:\n");
        printMat(mat, m, n);
      
        mat = sortMatRowAndColWise(mat, m, n);
      
        System.out.print("\nMatrix After Sorting:\n");
        printMat(mat, m, n);
    }
}
