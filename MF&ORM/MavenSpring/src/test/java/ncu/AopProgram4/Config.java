package ncu.AopProgram4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.AopProgram4")
public class Config {
	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		return employee;
	}
	@Bean 
	public Address address() {
		Address address = new Address("Sirsa","Haryana","India");
		return address;
	}
}
