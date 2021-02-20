package ncu.MavenSpringProgram8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//work like an xml file
@Configuration
@ComponentScan("ncu.MavenSpringProgram8")
//This is and optional statement
//For classes you are using Annotation
public class ConfigApp {
//	<bean id="cricketCoach" class=""></bean>
//	Annotation @Component("cricketCoach")

//	Java Config
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach();
	}
	@Bean
	public CricketCoach cricketCoach1() {
		return new CricketCoach();
	}
	@Bean
	public Fortune fortune() {
		return new Fortune();
	}
	@Bean
	public Coach cricketCoach2() {
		return new CricketCoach(fortune());
	}
}	
