package ncu.AopProgram;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoClass {
	@Before("execution(public void details())")
	public void beforeDetails() {
		System.out.println("\nIt Executes Before details method()");
	}
	@After("execution(public void details())")
	public void afterDetails() {
		System.out.println("\nIt Executes After details method() ");
	}
}
