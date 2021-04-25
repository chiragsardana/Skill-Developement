package LabTest;

//Apply divide and conquer technique to add nxn matrices. If n is not a 
//complete power of 2
//then add rows and columns with 0.

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer A[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};

		Integer B[][] = { {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}};
		Integer[][] C = multiplication(A, B);
		printMatrix(C);
		System.out.println(findNextPowerOf2(8));
		
	}
	public static void printMatrix(Integer[][] matrix) {
		System.out.println("The Matrix is : ");
		for(Integer i = 0;i < matrix.length;i++) {
			for(Integer j = 0;j < matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static Integer[][] multiplication(Integer[][] A, Integer[][] B) {
		Integer[][] C = new Integer[A.length][A.length];
		if(A.length == 1) {
//			C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
//			C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
//			C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
//			C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1]; 
			C[0][0] = A[0][0] + B[0][0];
		}else {
			Integer[][] a = new Integer[A.length/2][A.length/2];
			Integer[][] b = new Integer[A.length/2][A.length/2];
			Integer[][] c = new Integer[A.length/2][A.length/2];
			Integer[][] d = new Integer[A.length/2][A.length/2];
			
			Integer[][] e = new Integer[A.length/2][A.length/2];
			Integer[][] f = new Integer[A.length/2][A.length/2];
			Integer[][] g = new Integer[A.length/2][A.length/2];
			Integer[][] h = new Integer[A.length/2][A.length/2];
			
			// dividing matrix A into 4 parts
            divideArray(A, a, 0, 0);
            divideArray(A, b, 0, A.length / 2);
            divideArray(A, c, A.length / 2, 0);
            divideArray(A, d, A.length / 2, A.length / 2);

            // dividing matrix B into 4 parts
            divideArray(B, e, 0, 0);
            divideArray(B, f, 0, A.length / 2);
            divideArray(B, g, A.length / 2, 0);
            divideArray(B, h, A.length / 2, A.length / 2);
			
            Integer[][] C00 = multiplication(a, e);
            Integer[][] C01 = multiplication(b, f);
            Integer[][] C10 = multiplication(c, g);
            Integer[][] C11 = multiplication(d, h);
         // adding all subarray back into one
            copySubArray(C00, C, 0, 0);
            copySubArray(C01, C, 0, A.length / 2);
            copySubArray(C10, C, A.length / 2, 0);
            copySubArray(C11, C, A.length / 2, A.length / 2);
		}
		return C;
	}
	// divides array
    public static void divideArray(Integer[][] P, Integer[][] C, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
        
//        printMatrix(C);
    }

    // copies
    public static void copySubArray(Integer[][] C, Integer[][] P, int iB, int jB) 
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }
    // Compute power of two greater than or equal to `n`
    public static int findNextPowerOf2(int n)
    {
        // decrement `n` (to handle cases when `n` itself
        // is a power of 2)
        n = n - 1;
 
        // do till only one bit is left
        while ((n & n - 1) != 0) {
            n = n & n - 1;        // unset rightmost bit
        }
 
        // `n` is now a power of two (less than `n`)
 
        // return next power of 2
        return n << 1;
    }
    

}
