package ncu.AopProgram7;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	Logger logger = Logger.getLogger(LoggerAspect.class);
	long startTime, endTime;
	@Pointcut("execution(* Student.*())")
	public void expression1() {
		
	}
	
	@Before(value = "expression1()")
	public void beforeAdvice(JoinPoint jp) {
		logger.debug(" Going to start "+jp.getSignature());
		System.out.println("Start Call "+jp.getSignature());
		System.out.println("Method Name: "+jp.getStaticPart().getSignature().getName());
		startTime=System.currentTimeMillis();
		logger.debug("startTime: "+startTime);
	}
	@After(value = "expression1()")
	public void end(JoinPoint jp) {
		logger.debug(" Going to endtime "+jp.getSignature());
		endTime=System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
	}
}
