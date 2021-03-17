package ncu.AopProgram9;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
//	Create an Aspect class for Logging the information of the exception Thrown from the method of
//	EmployeeService class

	Logger logger = Logger.getLogger(EmployeeAspect.class);
	@Pointcut("execution(public Employee getEmployeewithId(Long))")
	public void expression1() {
		System.out.println("Expression 1");
	}
	@Around("expression1()")
	public Object aroundAdvice(ProceedingJoinPoint jp)throws Throwable{
		logger.debug("After Throwing Exception "+jp.getSignature());
		System.out.println("Executing Before the Method Execution.");
		Object obj = null;
		try {
			obj = jp.proceed();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Executing After the Method Execution.");
		}
		return obj;
	}
}
