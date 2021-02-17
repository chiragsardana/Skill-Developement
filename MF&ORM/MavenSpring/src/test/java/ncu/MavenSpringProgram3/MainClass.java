package ncu.MavenSpringProgram3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("springProgram3.xml");
    	CricketCoach cricket=(CricketCoach)ac.getBean("cricketCoach",CricketCoach.class);
    	System.out.println(cricket.getDailyWorkout() +"\n"+cricket.getFortune());
    	TennisCoach tennis = (TennisCoach)ac.getBean("tennisCoach", TennisCoach.class);
    	System.out.println(tennis.getDailyWorkout() +"\n"+tennis.getFortune());
    	HockeyCoach hockey = (HockeyCoach)ac.getBean("hockeyCoach", HockeyCoach.class);
    	System.out.println(hockey.getDailyWorkout() +"\n"+hockey.getFortune());
    	((ClassPathXmlApplicationContext)ac).close();
    }

}