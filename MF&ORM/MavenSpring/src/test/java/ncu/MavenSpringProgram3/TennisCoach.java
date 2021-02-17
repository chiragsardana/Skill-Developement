package ncu.MavenSpringProgram3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements ICouch{
//	public TennisCoach(IFortune fortune) {
//		super();
//		this.fortune = fortune;
//	}
	private IFortune fortune;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout method of Tennis Coach";
	}
	public String getFortune() {
		return "Tennis : "+fortune.getFortune();
	}
	@Autowired
	public void setFortune(IFortune fortune) {
		this.fortune = fortune;
	}
}
