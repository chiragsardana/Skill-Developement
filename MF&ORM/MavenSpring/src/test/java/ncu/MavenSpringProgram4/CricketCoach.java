package ncu.MavenSpringProgram4;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component("cricketCoach")
public class CricketCoach implements ICouch {
	
	private IFortune fortune;
	@Autowired
	public CricketCoach(@Qualifier("fortuneService")IFortune fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Daily Workout method of Cricket Coach";
	}
	public String getFortune() throws FileNotFoundException {
		return "Cricket : "+fortune.getFortune();
	}
	

}
