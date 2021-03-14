package ncu.AopProgram;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(ConfigApp.class);
		
		// get the bean from spring container
		ClassUsedForBeforeAndAfterCalling obj = context.getBean("classUsedForBeforeAndAfterCalling",ClassUsedForBeforeAndAfterCalling.class);
		
		// call the business method
		obj.details();;

		// do it again!
		System.out.println("\nlet's call it again!\n");
		
		// call the business method again
		obj.details();;
				
		// close the context
		context.close();
	}

}
