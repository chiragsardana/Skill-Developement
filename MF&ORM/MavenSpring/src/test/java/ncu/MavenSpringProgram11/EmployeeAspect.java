package ncu.MavenSpringProgram11;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeAspect {
	@Before("execution(public String getName())")
	public void beforeGetName() {
		System.out.println("Before getName method.");
	}
//	@After("execution(public void ncu.MavenSpringProgram11.setName(String name))")
//	public void afterSetName() {
//		System.out.println("After setName method.");
//	}
//	@Around("execution(* ncu.MavenSpringProgram11.*(..))")
//	public void aroundAnnotation() {
//		System.out.println("Around Annotation Method.");
//	}
}
