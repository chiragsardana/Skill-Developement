package ncu.MavenSpringProgram9;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.*;

import ncu.MavenSpringProgram8.ConfigApp;  
  
public class Main {  
    public static void main(String[] args) {  
          
    	ApplicationContext ac = new AnnotationConfigApplicationContext(ncu.MavenSpringProgram9.ConfigApp.class); 
        Employee e1 = ac.getBean("employee1",Employee.class);
        Employee e2 = ac.getBean("employee2",Employee.class);
        Employee e3 = ac.getBean("employee3",Employee.class);
        
        e1.show();
        e2.show();
        e3.show();
        ((AnnotationConfigApplicationContext)ac).close();
        
    }  
}
