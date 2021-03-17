package ncu.AopProgram9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.AopProgram9")
public class Config {
	@Bean
	@Scope("prototype")
	public Employee employee() {
		return new Employee(12345,"Chirag", "Sardana","Chirag19CSU071@ncuindia.edu");
	}
	@Bean
	@Scope("singleton")
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
}
