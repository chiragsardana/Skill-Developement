package Program7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ICouch coach=(ICouch)context.getBean("myTennisCoach1");
		coach.setName("Chirag");
		ICouch coach1 = (ICouch)context.getBean("myTennisCoach1");
		coach1.setName("Sardana");
//		System.out.println("The Name of the Coach is : ");
		System.out.println(coach+"\n"+coach1);
		System.out.println("The Object is equal : "+coach.equals(coach1));//CHecking whether it refers to same memory location or not
		
		System.out.println(coach.getName()+"\n"+coach1.getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}