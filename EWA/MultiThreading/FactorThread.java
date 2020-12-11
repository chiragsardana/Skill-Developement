package MultiThreading;

public class FactorThread implements Runnable {
	private String threadName;
	private int Number;
	private String Factor;
	FactorThread(String threadName,int Number){
		this.threadName = threadName;
		this.Number = Number;
		System.out.println("Creating "+this.threadName+" Thread.");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Factor of "+this.Number+" is : "+factor());
		System.out.println("Exiting "+this.threadName);
	}
	
	public String factor() {
		Factor = "";
		for(int i = 1;i <= Number ;i++)
        {
            if(Number % i == 0 )
                Factor =Factor + i +" ";
        }
		return Factor;
	}
}
