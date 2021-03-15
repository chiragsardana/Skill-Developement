package ncu.AopProgram8;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
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
	@AfterThrowing("expression1()")
	public void afterThrowingAdvice(JoinPoint jp)throws Exception{
		logger.debug("After Throwing Exception "+jp.getSignature());
		System.out.println("Executing After Throwing Advice");
	}
}
