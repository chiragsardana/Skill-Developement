package ncu.AopProgram8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp =context.getBean(Employee.class);
		EmployeeService empService =context.getBean(EmployeeService.class);
		empService.addEmployee(emp);
		empService.getEmployeewithId(new Long(12345));
		System.out.println(emp);
		((AnnotationConfigApplicationContext)context).close();
	}

}
