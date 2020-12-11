package MultiThreading;

public class FactorialThread implements Runnable{
	private String threadName;
	private int Number;
	FactorialThread(String threadName, int Number){
		this.threadName = threadName;
		this.Number = Number;
		System.out.println("Creating "+this.threadName+" Thread.");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Factorial "+this.Number+" is : "+factorial());
		System.out.println("Exiting "+this.threadName);
	}
	public long factorial() {
		long fac = 1;
        for(int i = 2;i <= Number;i++)
        {
            fac *= i;
        }
        return fac;
	}

}
