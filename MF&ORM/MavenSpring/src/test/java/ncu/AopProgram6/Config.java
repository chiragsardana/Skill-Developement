package ncu.AopProgram6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.AopProgram6")
public class Config {
	@Bean
	public Chirag chirag() {
		return new Chirag();
	}
}
