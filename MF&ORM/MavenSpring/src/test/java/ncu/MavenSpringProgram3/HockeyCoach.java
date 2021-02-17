package ncu.MavenSpringProgram3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hockeyCoach")
public class HockeyCoach implements ICouch {

	@Autowired
	private IFortune fortune;
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout method of Hockey Coach";
	}
	public String getFortune() {
		return "Hockey : "+fortune.getFortune();
	}
}
