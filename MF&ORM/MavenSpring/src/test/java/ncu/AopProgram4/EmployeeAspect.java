package ncu.AopProgram4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	@Pointcut("execution(public String ncu.AopProgram4.Employee.getName())")  
    public void k(){
		System.out.println("Pointcut Expression 1!!!");
	}//pointcut name  
    @Before("k()")//applying pointcut on before advice  
    public void beforeAdvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern Before");  
        System.out.println("Method Signature: "  + jp.getSignature());  
    } 
    @Pointcut("execution(public void ncu.AopProgram4.Employee.setName(String))")
    public void k1() {
    	System.out.println("Point Cut Expression 2!!!");
    }
    @After("k1()")
    public void afterAdvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern After");  
        System.out.println("Method Signature: "  + jp.getSignature());  
    }
    @Pointcut("execution(public Double ncu.AopProgram4.Employee.calculate_sal())")
    public void k2() {
    	System.out.println("Point Cut Expression 3!!!");
    }
    @Around("k2()")
    public Object aroundAdvice(ProceedingJoinPoint jp) {
    	System.out.println("Before Calculate Salary Method");
    	Object obj = null;
    	try {
    		obj = jp.proceed();
    	}catch(Throwable e) {
    		e.printStackTrace();
    	}finally {
    		System.out.println("After Calculate Salary Method");
    	}
    	return obj;
    }
}
