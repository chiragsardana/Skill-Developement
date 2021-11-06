package Experiment7th;

import java.util.Scanner;

public class NonPreemptivePriorityCPUSchedulingAlgorithm 
{

    static Integer burstTime[];
    static Integer priority[];
    static Integer arrivalTime[];
    static String[] processId;
    static Integer numberOfProcess;

    public static void getProcessData(Scanner input) 
    {
        System.out.print("Enter the number of Process for Scheduling           : ");
        int inputNumberOfProcess = input.nextInt();
        numberOfProcess = inputNumberOfProcess;
        burstTime = new Integer[numberOfProcess];
        priority = new Integer[numberOfProcess];
        arrivalTime = new Integer[numberOfProcess];
        processId = new String[numberOfProcess];
        String st = "P";
        for (int i = 0; i < numberOfProcess; i++) 
        {
            processId[i] = st.concat(Integer.toString(i));
            System.out.print("Enter the burst time   for Process - " + (i) + " : ");
            burstTime[i] = input.nextInt();
            System.out.print("Enter the arrival time for Process - " + (i) + " : ");
            arrivalTime[i] = input.nextInt();
            System.out.print("Enter the priority     for Process - " + (i) + " : ");
            priority[i] = input.nextInt();
        }
    }

    public static void sortAccordingArrivalTimeAndPriority(Integer[] at, Integer[] bt, Integer[] prt, String[] pid) 
    {

        Integer temp;
        String stemp;
        for (int i = 0; i < numberOfProcess; i++) 
        {

            for (int j = 0; j < numberOfProcess - i - 1; j++) 
            {
                if (at[j] > at[j + 1]) 
                {
                    //swapping arrival time
                    temp = at[j];
                    at[j] = at[j + 1];
                    at[j + 1] = temp;

                    //swapping burst time
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;

                    //swapping priority
                    temp = prt[j];
                    prt[j] = prt[j + 1];
                    prt[j + 1] = temp;

                    //swapping process identity
                    stemp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = stemp;

                }
                //sorting according to priority when arrival timings are same
                if (at[j] == at[j + 1]) 
                {
                    if (prt[j] > prt[j + 1]) 
                    {
                        //swapping arrival time
                        temp = at[j];
                        at[j] = at[j + 1];
                        at[j + 1] = temp;

                        //swapping burst time
                        temp = bt[j];
                        bt[j] = bt[j + 1];
                        bt[j + 1] = temp;

                        //swapping priority
                        temp = prt[j];
                        prt[j] = prt[j + 1];
                        prt[j + 1] = temp;

                        //swapping process identity
                        stemp = pid[j];
                        pid[j] = pid[j + 1];
                        pid[j + 1] = stemp;

                    }
                }
            }
        }
    }

    public static void priorityNonPreemptiveAlgorithm() 
    {
        int finishTime[] = new int[numberOfProcess];
        Integer bt[] = burstTime.clone();
        Integer at[] = arrivalTime.clone();
        Integer prt[] = priority.clone();
        String pid[] = processId.clone();
        int waitingTime[] = new int[numberOfProcess];
        int turnAroundTime[] = new int[numberOfProcess];

        sortAccordingArrivalTimeAndPriority(at, bt, prt, pid);

        //calculating waiting & turn-around time for each process
        finishTime[0] = at[0] + bt[0];
        turnAroundTime[0] = finishTime[0] - at[0];
        waitingTime[0] = turnAroundTime[0] - bt[0];

        for (int i = 1; i < numberOfProcess; i++) 
        {
            finishTime[i] = bt[i] + finishTime[i - 1];
            turnAroundTime[i] = finishTime[i] - at[i];
            waitingTime[i] = turnAroundTime[i] - bt[i];
        }
        float sum = 0;
        for (int n : waitingTime) 
        {
            sum += n;
        }
        float averageWaitingTime = sum / numberOfProcess;

        sum = 0;
        for (int n : turnAroundTime) 
        {
            sum += n;
        }
        float averageTurnAroundTime = sum / numberOfProcess;

        //printing the order of processes along with their finish time & turn around time
        System.out.println("Priority Scheduling Algorithm : ");
        System.out.println("ProcessId \tBurstTime \tArrivalTime \tPriority \tFinishTime \tWaitingTime \tTurnAroundTime");
        for (int i = 0; i < numberOfProcess; i++) {
            System.out.println("" +pid[i]+" \t\t"+bt[i]+" \t\t"+at[i]+" \t\t"+prt[i]+"\t\t "+finishTime[i]+"\t\t "+waitingTime[i]+" \t\t"+turnAroundTime[i]);
        }

        System.out.format("Average: "+averageWaitingTime+"\t\t "+averageTurnAroundTime);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        getProcessData(input);
        priorityNonPreemptiveAlgorithm();
    }
}
