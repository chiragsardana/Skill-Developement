package ncu.MavenSpringProgram8;

public class CricketCoach implements Coach{
	public CricketCoach() {
		super();
	}
	private Fortune fortune;
	public CricketCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}
	public String getFortune() {
		return this.fortune.getFortune();
	}
	@Override
	public String getRoutine() {
		// TODO Auto-generated method stub
		return "Cricket Coach Class Get Daily Workout";
	}
	public String display() {
		return "Display Method of CricketCoach";
	}
	
}
