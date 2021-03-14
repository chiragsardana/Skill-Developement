package ncu.AopProgram1;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {  
		ApplicationContext context = new ClassPathXmlApplicationContext("AopProgram1.xml"); 
	      
	    A a=context.getBean("proxy",A.class);  
	    a.m(); 
	    ((ClassPathXmlApplicationContext)context).close();
	}
}
