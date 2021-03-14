package ncu.MavenSpringProgram12;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("ncu.MavenSpringProgram12.*")
public class Config {
    @Bean
    public Address address()
    {
        return new Address();
    }
}
