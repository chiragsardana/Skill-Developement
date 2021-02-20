package ncu.MavenSpringProgram6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component("beanLifeCycle")
public class BeanLifeCycle {
	public BeanLifeCycle() {
		System.out.println("Bean Instantiated");
	}
	@PostConstruct
    public void init() throws Exception 
    { 
        System.out.println("init() method"); 
    } 
  
    @PreDestroy
    public void destroy() throws Exception 
    { 
        System.out.println( "destroy() method");
        close();
    } 
    public void close() {
		System.out.println("Closing All Resources");
	}
}
