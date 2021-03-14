package ncu.MavenSpringProgram11;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.SBK")
public class Config {
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		return employee;
	}
//	@Bean 
//	public Address address() {
//		Address address = new Address("Sirsa","Haryana","India");
//		return address;
//	}
}
