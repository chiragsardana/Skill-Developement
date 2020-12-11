package MultiThreading;

public class FirstThread implements Runnable{

	private String name;
	private int randomNumber;
	FirstThread(String name){
		this.name = name;
		System.out.println("Creating : "+this.name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i < 5 ;i++) {
			randomNumber = (int)(Math.random()*100);
			if(randomNumber % 2 ==0) {
				SecondThread secondThread = new SecondThread("second", randomNumber);
//				Thread secondThread = new Thread(second);
				secondThread.start();
			}else {
				System.out.println("The Random Number is : "+randomNumber);
			}
			try {//For sleep
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Exiting..."+this.name);
		}
		
	}

}
