package Program2;

public class BasetBall implements ICouch {
	
	private IFortune fortune;
	public BasetBall(IFortune fortune) {
		// TODO Auto-generated constructor stub
		System.out.println("This is BasketBall Coach.");
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go to Gym And Start Excercising";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
