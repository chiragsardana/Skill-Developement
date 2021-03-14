package ncu.MavenSpringProgram11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(ncu.MavenSpringProgram11.Config.class);
		Employee emp = context.getBean("employee",Employee.class);
		emp.setName("Chirag");
		System.out.println(emp.getName());
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
