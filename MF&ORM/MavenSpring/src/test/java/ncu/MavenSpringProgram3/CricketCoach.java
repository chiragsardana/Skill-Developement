package ncu.MavenSpringProgram3;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("cricketCoach")
public class CricketCoach implements ICouch {
	
	private IFortune fortune;
//	public CricketCoach() {
//		// TODO Auto-generated constructor stub
//	}
	@Autowired
	public CricketCoach(IFortune fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout method of Cricket Coach";
	}
	public String getFortune() {
		return "Cricket : "+fortune.getFortune();
	}
	

}
