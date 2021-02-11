package ncu.MavenSpringProgram1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springProgram1.xml");
		System.out.println("Bean Factory Called.");
		
		System.out.println("By Constructor");
		Employee obj = (Employee)context.getBean("employee");
		System.out.println(obj);
		System.out.println("By Name");
		Employee obj1 = (Employee)context.getBean("employee1");
		System.out.println(obj1);
		System.out.println("By Value");
		Employee obj2 = (Employee)context.getBean("employee2");
		System.out.println(obj2);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
