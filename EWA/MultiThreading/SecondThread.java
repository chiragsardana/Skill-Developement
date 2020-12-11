package MultiThreading;

public class SecondThread extends Thread{
	private String name;
	private int count;
	SecondThread(String name,int count){
		this.name = name;
		this.count = count;
		System.out.println("Creating: "+this.name);
	}
	@Override
	public void run() {
		System.out.println("Square of an Random Number: "+count*count);
		System.out.println("Exiting..."+this.name);
	}
}
