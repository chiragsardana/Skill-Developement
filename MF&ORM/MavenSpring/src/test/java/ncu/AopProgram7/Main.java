package ncu.AopProgram7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean(Student.class);
		System.out.println(student);
		((AnnotationConfigApplicationContext)context).close();
	}

}
