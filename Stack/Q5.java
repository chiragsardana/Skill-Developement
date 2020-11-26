package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the Total Number of Disks : ");
		int n = Integer.parseInt(reader.readLine()); // Number of disks 
		towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods 

	}
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) 
	{ 
		if (n == 1) 
		{ 
			System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod); 
			return; 
		} 
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod); 
		System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod); 
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod); 
	}

}
