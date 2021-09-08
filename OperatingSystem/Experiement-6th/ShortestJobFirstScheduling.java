package Experiment6th;

import java.util.Scanner;

public class ShortestJobFirstScheduling {

	//Assuming Arrival Time is 0 for all processes
	public static void main(String args[]) 
	{  
		Scanner input = new Scanner(System.in); 
		Integer n,burstTime[],waitingTime[],totalAroundTime[], processes[]; 
		
		System.out.println("Enter no of process"); 
		
		n = input.nextInt(); 
		
		burstTime = new Integer[n+1]; 
		waitingTime = new Integer[n+1]; 
		totalAroundTime = new Integer[n+1];
		processes = new Integer[n+1];
		System.out.println("Enter Burst time for each process"); 
		for(int i=0;i<n;i++) 
		{ 
			System.out.println("Enter BT for process "+(i+1)); 
			burstTime[i]=input.nextInt(); 
			processes[i]=i+1;
		}
		sjfs(burstTime, waitingTime, totalAroundTime, processes,n);
		printSolution(burstTime, waitingTime, totalAroundTime, processes,n);
		
	}
	public static void sjfs(Integer[] burstTime, Integer[] waitingTime, Integer[] totalAroundTime, Integer[] processes, Integer n) {
		
		
	
		for(int i=0;i<n;i++) 
		{
			waitingTime[i]=0; 
			totalAroundTime[i]=0; 
		} 
		int temp; 
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<n-1;j++) 
			{ 
				if(burstTime[j]>burstTime[j+1])    
				{
					temp=burstTime[j]; 
					burstTime[j]=burstTime[j+1]; 
					burstTime[j+1]=temp; 
					temp=processes[j]; 
					processes[j]=processes[j+1]; 
					processes[j+1]=temp; 
				}
			}
		} 
	
		
	
	
	
		
	}
	public static void printSolution(Integer[] burstTime, Integer[] waitingTime, Integer[] totalAroundTime, Integer[] processes, Integer n) {
		

		float averageWaitingTime=0;
		float averageTurnAroundTime=0;
	
		
		for(int i = 0;i < n;i++) 
		{
			totalAroundTime[i] = burstTime[i]+ waitingTime[i]; 
		    waitingTime[i+1]=totalAroundTime[i]; 
		} 
	
		for(int j=0;j < n;j++) {
			totalAroundTime[j] = waitingTime[j] + burstTime[j];
			averageWaitingTime += waitingTime[j]; 
		}
		System.out.println("  PROCESS   BT      WT      TAT     "); 
		for(int i=0;i<n;i++) 
		System.out.println("    "+ processes[i] + "       "+burstTime[i]+"       "+waitingTime[i]+"       "+totalAroundTime[i]); 
	
		averageWaitingTime=averageWaitingTime/n; 
		System.out.println("***********************************************"); 
		System.out.println("Avg waiting time="+averageWaitingTime+"\n***********************************************"); 
	
		for(int i=0;i<n;i++) 
		{ 
			totalAroundTime[i]=waitingTime[i]+burstTime[i]; 
			averageTurnAroundTime = averageTurnAroundTime+totalAroundTime[i]; 
		}
	
		averageTurnAroundTime=averageTurnAroundTime/n; 
		System.out.println("***********************************************"); 
		System.out.println("Avg turn around time="+averageTurnAroundTime+"\n***********************************************"); 
	
	}
}
