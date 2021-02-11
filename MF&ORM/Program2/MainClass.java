package Program2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ICouch coach=(ICouch)context.getBean("myBasketBallCoach");
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
	}

}