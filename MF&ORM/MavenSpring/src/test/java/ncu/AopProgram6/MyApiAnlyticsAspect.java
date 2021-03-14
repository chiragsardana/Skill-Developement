package ncu.AopProgram6;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(74)
@Component
public class MyApiAnlyticsAspect {
	@Pointcut("execution(public Integer getAge())")
	public void expression1() {
		
	}
	@Before("expression1()")
	public void beforeAdvice() {
		System.out.println(this.getClass().getName());
		System.out.println("This is Before Advice");
	}
	@After("expression1()")
	public void afterAdvice() {
		System.out.println(this.getClass().getName());
		System.out.println("This is After Advice");
	}
}
