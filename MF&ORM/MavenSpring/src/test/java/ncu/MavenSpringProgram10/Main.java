package ncu.MavenSpringProgram10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
		  = new AnnotationConfigApplicationContext(Config.class);

		Student student = context.getBean(Student.class);
		System.out.println(student);
	}
}
