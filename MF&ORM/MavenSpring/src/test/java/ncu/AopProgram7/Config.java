package ncu.AopProgram7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.AopProgram7")
public class Config {
	@Bean
	public Student student() {
		return new Student();
	}
}
