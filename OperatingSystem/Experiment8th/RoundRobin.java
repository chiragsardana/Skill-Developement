package Experiment8th;

import java.io.IOException;
import java.util.Scanner;

public class RoundRobin {
	public static void main(String args[])throws IOException{
		Scanner in=new Scanner(System.in);
		int i,j,k,q,sum=0;
		System.out.println("Enter number of process:");
		
		int n = in.nextInt();
		
		int bt[]=new int[n];
		int wt[]=new int[n];
		int tat[]=new int[n];
		
		int a[]=new int[n];
		
		System.out.println("Enter brust Time:");
		for(i=0;i<n;i++){
			System.out.println("Enter brust Time for "+(i+1));
			bt[i]=in.nextInt();
		}
		
		System.out.println("Enter Time quantum:");
		q=in.nextInt();
		
//		Copying the BurstTime in to an Another Array
		for(i = 0;i < n;i++)
			a[i]=bt[i];
		
//		Assigninng Waitingtime to Zero intially
		for(i=0;i<n;i++)
			wt[i]=0;
		
		do{
			for(i = 0;i < n;i++){
				if(bt[i] > q){ //Checking whether burst time is greater than time quantum
					bt[i]-=q;//if yes subtract the time quantum from that
					for(j = 0;j < n;j++){
						if((j!=i)&&(bt[j]!=0))//CHecking whether the burstTime is not zero 
							wt[j]+=q;//and calculating the waiting time for each process 
					}				// after every time quantum
				}
				else{
					for(j=0;j < n;j++){
						if((j!=i)&&(bt[j]!=0))
							wt[j]+=bt[i];
					}
					bt[i]=0;// Process is done, so making burst time zero now
				}
			}
			sum=0;
			for(k=0;k<n;k++)
				sum=sum+bt[k];
			}
		while(sum!=0);
		
		for(i=0;i<n;i++)
			tat[i]=wt[i]+a[i];
		
		System.out.println("process\t\tBT\tWT\tTAT");
		
		for(i=0;i<n;i++){
			System.out.println("process"+(i+1)+"\t"+a[i]+"\t"+wt[i]+"\t"+tat[i]);
		}
		float avg_wt=0;
		float avg_tat=0;
		for(j=0;j<n;j++){
			avg_wt+=wt[j];
		}
		for(j=0;j<n;j++){
			avg_tat+=tat[j];
		}
		System.out.println("average waiting time "+(avg_wt/n)+"\n Average turn around time"+(avg_tat/n));
	}
}
