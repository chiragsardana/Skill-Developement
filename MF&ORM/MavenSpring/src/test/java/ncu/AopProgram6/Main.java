package ncu.AopProgram6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Chirag chirag = context.getBean(Chirag.class);
		chirag.getAge();
	}

}
