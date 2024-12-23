/*
The Tower of Hanoi is a classic mathematical puzzle involving three rods and a number of disks of different sizes. 
The objective is to move all the disks from the first rod (source) to the third rod (destination) using the 
second rod (auxiliary) as an intermediate, following these rules:
Rules:
1. Only one disk can be moved at a time.
2. A larger disk cannot be placed on top of a smaller disk.
3. Each move involves transferring the top disk from one rod to another
*/
public class TowerOfHanoi {

    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            // Base case: Move one disk directly from source to destination
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, destination, auxiliary);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move the n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Tower of Hanoi solution for " + n + " disks:");
        solveHanoi(n, 'A', 'B', 'C'); // A = source, B = auxiliary, C = destination
    }
}
