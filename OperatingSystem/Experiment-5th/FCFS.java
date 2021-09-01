package Experiment5th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FCFS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of Processes: ");
		Integer noProcess = input.nextInt();
		Integer[] processes = new Integer[noProcess];
        //Burst time
        Integer[] burstTime = new Integer[noProcess];
        inputTaker(processes, burstTime, input);        
        findAverageTime(processes, burstTime);
	}
	//Input Method
	public static void inputTaker(Integer[] processes, Integer[] burstTime, Scanner input) {
		
		for(Integer i = 0;i < processes.length;i++) {
			processes[i] = i+1;
		}
		System.out.println("Enter the Burst Time");
        for(Integer i = 0;i < processes.length;i++) {
			burstTime[i] = input.nextInt();
		} 
	}
	//	Finding Waiting Time
	public static void findWaitingTime(Integer[] processes, Integer[] burstTime, Integer[] waitingTime) {
		
		//Waiting for 1st Process is always zero
		waitingTime[0] = 0;
		
		for(Integer i = 1;i < processes.length;i++) {
			waitingTime[i] = waitingTime[i-1] + burstTime[i-1];
		}
	}
	//	Finding Turn Around Time
	public static void findTurnAroundTime(Integer[] processes, Integer[] burstTime, Integer[] waitingTime, Integer[] turnAroundTime) {
		for(Integer i = 0;i < processes.length;i++) {
			turnAroundTime[i] = burstTime[i] + waitingTime[i];
		}
	}
	// 	Finding Average Time
	public static void findAverageTime(Integer[] processes, Integer[] burstTime) {
		if(processes.length < 1) {
			return;
		}
		Integer[] waitingTime = new Integer[processes.length];
		Integer[] turnAroundTime = new Integer[processes.length];
		
		Integer totalWaitingTime = 0;
		Integer totalTurnAroundTime = 0;
		
		findWaitingTime(processes, burstTime, waitingTime);
		
		findTurnAroundTime(processes, burstTime, waitingTime, turnAroundTime);
		
		for(Integer i = 0; i < processes.length;i++) {
			totalWaitingTime += waitingTime[i];
			totalTurnAroundTime += turnAroundTime[i];
		}
		Double averageWaitingTime = (double) (totalWaitingTime/processes.length);
		Double averageTurnAroundTime = (double) (totalTurnAroundTime/ processes.length);
		printRequiredSolution(processes, burstTime, waitingTime, turnAroundTime, averageWaitingTime, averageTurnAroundTime);
	}
	//	printing the Required Solution
	public static void printRequiredSolution(Integer[] processes, Integer[] burstTime, Integer[] waitingTime, Integer[] turnAroundTime, Double averageWaitingTime,Double averageTurnAroundTime) {
		System.out.println("Processes\t\tBurst Time\t\tWaiting Time\t\tTurn Around Time");
		for(Integer i = 0;i < processes.length;i++) {
			System.out.println(processes[i]+"\t\t\t"+burstTime[i]+"\t\t\t"+waitingTime[i]+"\t\t\t"+turnAroundTime[i]);
		}
		System.out.println("The Average Waiting Time: "+averageWaitingTime);
		System.out.println("The Average Turn Around Time: "+averageTurnAroundTime);
	}

}
