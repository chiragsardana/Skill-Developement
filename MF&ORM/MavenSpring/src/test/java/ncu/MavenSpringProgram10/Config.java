package ncu.MavenSpringProgram10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
	@Bean
	@Primary
	public Student student1() {
		return new Student(20,"Chirag");
	}
	@Bean
	public Student student2() {
		return new Student(20,"Ayush");
	}
	@Bean
	public Profile profile() {
		return new Profile(student1());
	}
}
