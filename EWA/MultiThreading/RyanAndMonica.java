package MultiThreading;

public class RyanAndMonica implements Runnable{
	private BankAccount account;
	RyanAndMonica(){
		account = new BankAccount();
	}
	@Override
	public void run() {
		for(int i =0;i <= 4;i++) {
			makeWithDrawl(30);
		}
	}
	synchronized void makeWithDrawl(int amount) {
		if(account.getBalance() > amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs "+amount+"!!! ");
			try {
				System.out.println(Thread.currentThread().getName()+" is going to sleep");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" is going to withdrawl");
			account.withdraw(amount);
			System.out.println("\nThe Remaining Balance is : "+account.getBalance());
			System.out.println();
		}else {
			System.out.println("Not Sufficient Balance for "+Thread.currentThread().getName());
		}
	}
}
