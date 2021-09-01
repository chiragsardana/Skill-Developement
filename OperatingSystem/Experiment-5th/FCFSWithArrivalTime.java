package Experiment5th;

import java.util.Scanner;

public class FCFSWithArrivalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of Processes: ");
		Integer noProcess = input.nextInt();
		Integer[] processes = new Integer[noProcess];
        //Burst time
        Integer[] burstTime = new Integer[noProcess];
        //Arrival Time
        Integer[] arrivalTime = new Integer[noProcess];
        inputTaker(processes, burstTime, arrivalTime, input);        
        findAverageTime(processes, burstTime, arrivalTime);
	}
	//Input Method
	public static void inputTaker(Integer[] processes, Integer[] burstTime, Integer[] arrivalTime, Scanner input) {
			
		for(Integer i = 0;i < processes.length;i++) {
			processes[i] = i+1;
		}
		System.out.println("Enter the Burst Time");
		for(Integer i = 0;i < processes.length;i++) {
			burstTime[i] = input.nextInt();
		}
		System.out.println("Enter the Arrival Time");
		for(Integer i = 0;i < processes.length;i++) {
			arrivalTime[i] = input.nextInt();
		}
	}
	//Finding Average Time
	public static void findAverageTime(Integer[] processes, Integer[] burstTime, Integer[] arrivalTime) {
		if(processes.length < 1) {
			return;
		}
		Integer[] waitingTime = new Integer[processes.length];
		Integer[] turnAroundTime = new Integer[processes.length];
		Integer[] completionTime = new Integer[processes.length];
		
		Integer totalWaitingTime = 0;
		Integer totalTurnAroundTime = 0;
		
		findWaitingTime(processes, burstTime, waitingTime, arrivalTime);
		
		findTurnAroundTime(processes, burstTime, waitingTime, turnAroundTime);
		
		for(Integer i = 0; i < processes.length;i++) {
			totalWaitingTime += waitingTime[i];
			totalTurnAroundTime += turnAroundTime[i];
			completionTime[i] = turnAroundTime[i] + arrivalTime[i];
		}
		Double averageWaitingTime = (double) (totalWaitingTime/processes.length);
		Double averageTurnAroundTime = (double) (totalTurnAroundTime/ processes.length);
		printRequiredSolution(processes, burstTime, waitingTime, turnAroundTime, arrivalTime, completionTime, averageWaitingTime, averageTurnAroundTime);
	}
//	printing the Required Solution
	public static void printRequiredSolution(Integer[] processes, Integer[] burstTime, Integer[] waitingTime, Integer[] turnAroundTime, Integer[] arrivalTime, Integer[] completionTime, Double averageWaitingTime,Double averageTurnAroundTime) {
		System.out.println("Processes\t\tBurst Time\t\tArrival Time\t\tWaiting Time\t\tTurn Around Time\t\t Completion Time");
		for(Integer i = 0;i < processes.length;i++) {
			System.out.println(processes[i]+"\t\t\t\t"+burstTime[i]+"\t\t\t"+arrivalTime[i]+"\t\t\t"+waitingTime[i]+"\t\t\t"+turnAroundTime[i]+"\t\t\t\t"+completionTime[i]);
		}
		System.out.println("The Average Waiting Time: "+averageWaitingTime);
		System.out.println("The Average Turn Around Time: "+averageTurnAroundTime);
	}
	//Finding Waiting Time
	public static void findWaitingTime(Integer[] processes, Integer[] burstTime, Integer[] waitingTime, Integer[] arrivalTime) {
		
		//Waiting for 1st Process is always zero
		waitingTime[0] = 0;
		Integer[] serviceTime = new Integer[processes.length];
		serviceTime[0] = 0;
		
		for(Integer i = 1;i < processes.length;i++) {
			waitingTime[i] = waitingTime[i-1] + burstTime[i-1];
			//representing wasted time in queue
	        Integer wasted=0;
	        // Add burst time of previous processes
	        serviceTime[i] = serviceTime[i-1] + burstTime[i-1];
	 
	        // Find waiting time for current process =
	        // sum - at[i]
	        waitingTime[i] = serviceTime[i] - arrivalTime[i];
	 
	        // If waiting time for a process is in negative
	        // that means it is already in the ready queue
	        // before CPU becomes idle so its waiting time is 0
	        // wasted time is basically time for process to wait after a process is over
	        if (waitingTime[i] < 0) {
	            wasted = Math.abs(waitingTime[i]);
	            waitingTime[i] = 0;
	        }
	        //Add wasted time
	        serviceTime[i] = serviceTime[i] + wasted;
		}
	}
	//Finding Turn Around Time
	public static void findTurnAroundTime(Integer[] processes, Integer[] burstTime, Integer[] waitingTime, Integer[] turnAroundTime) {
		for(Integer i = 0;i < processes.length;i++) {
			turnAroundTime[i] = burstTime[i] + waitingTime[i];
		}
	}
	
}
