package ncu.MavenSpringProgram8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigApp.class);
		Coach cricketCoach =  ac.getBean("cricketCoach", CricketCoach.class);
		
		CricketCoach cricketCoach1 =  ac.getBean("cricketCoach1", CricketCoach.class);
		
		Coach cricketCoach2 =  ac.getBean("cricketCoach2", Coach.class);
		
		System.out.println(cricketCoach2.getRoutine());
		
//		System.out.println(cricketCoach.getRoutine()
//				+"\n"+cricketCoach1.display());
		((AnnotationConfigApplicationContext)ac).close();
	}
}
