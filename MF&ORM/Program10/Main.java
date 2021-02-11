package Program10;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Bean Factory Called.");
//		Details obj =(Details) context.getBean("program10");
		

//		System.out.println(obj);
		
		Details obj1 =(Details) context.getBean("program10a");
		
		List<String> names = new ArrayList<>();
		names.add("Chirag");
		names.add("Sardana");
		names.add("123");
		obj1.setNames(names);
		System.out.println(obj1);
		((ClassPathXmlApplicationContext)context).close();
	    
	}

}
