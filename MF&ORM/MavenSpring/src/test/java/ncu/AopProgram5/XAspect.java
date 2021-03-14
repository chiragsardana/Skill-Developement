package ncu.AopProgram5;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XAspect {
	@Pointcut("execution(* X.*(..))")
	public void expression1() {
		
	}
	@Around("expression1()")
	public Object aroundAdvice(ProceedingJoinPoint jp) {
		Object obj = null;
		long startTime = 0;
		try {
			System.out.println("Now Start Measuring Time");
			 startTime = System.currentTimeMillis();
			obj = jp.proceed();
		}catch(Throwable e) {
			e.printStackTrace();
		}finally {
			System.out.println("Now End Measuring Time");
			long endTime = System.currentTimeMillis();
			System.out.println("Total Time is: "+(endTime - startTime)+" ms");
		}
		return obj;
	}
	
}
