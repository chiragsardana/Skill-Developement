package ncu.AopProgram5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Program Started");
		X x = context.getBean(X.class);
		x.logic();
		((AnnotationConfigApplicationContext)context).close();
	}
}
