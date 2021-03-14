package ncu.AopProgram4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean("employee",Employee.class);
		emp.setName("Chirag");
		System.out.println(emp.getName());
		emp.setNoOfDaysWorking(5);
		System.out.println("Calling Calculate Salary Method\nThe Calculated Salary is: "+emp.calculate_sal());
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
