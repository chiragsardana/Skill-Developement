package ncu.AopProgram5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.AopProgram5")
public class Config {
	@Bean
	public X x() {
		return new X();
	}
}
