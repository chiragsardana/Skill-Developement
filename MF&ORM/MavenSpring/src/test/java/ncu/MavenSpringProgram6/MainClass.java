package ncu.MavenSpringProgram6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springProgram6.xml");
    	BeanLifeCycle obj = (BeanLifeCycle)ac.getBean("beanLifeCycle",BeanLifeCycle.class);
    	
    	((ClassPathXmlApplicationContext)ac).close();
	}
}
