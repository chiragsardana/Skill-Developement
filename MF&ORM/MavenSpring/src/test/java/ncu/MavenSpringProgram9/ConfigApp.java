package ncu.MavenSpringProgram9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//work like an xml file
@Configuration
@ComponentScan("ncu.MavenSpringProgram9")
//This is and optional statement
//For classes you are using Annotation
public class ConfigApp {
//	<bean id="cricketCoach" class=""></bean>
//	Annotation @Component("cricketCoach")

//	Java Config
	@Bean
	public Address address1() {
		return new Address("Sirsa", "Haryana", "India");
	}
	@Bean
	public Address address2() {
		return new Address("Gurugram", "Haryana", "India");
	}
	@Bean
	public Address address3() {
		return new Address("Hissar", "Haryana", "India");
	}
	@Bean
	public Employee employee1() {
		return new Employee(071,"Chirag Sardana",address1());
	}
	@Bean
	public Employee employee2() {
		return new Employee(076,"Deepak Jindal",address2());
	}
	@Bean
	public Employee employee3() {
		return new Employee(060,"Ayush Singh",address3());
	}
}	
