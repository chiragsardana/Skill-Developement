package ncu.AopProgram3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
	public static void main(String[] args) {  
	   
		ApplicationContext context = new ClassPathXmlApplicationContext("AopProgram3.xml"); 
	    Validator v= context.getBean("proxy",Validator.class);  
	    try{  
	    	v.validate(12);  
	    }catch(Exception e){
	    	e.printStackTrace();
	    }  
	}  
} 
