package ncu.MavenSpringProgram5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ncu.MavenSpringProgram4.CricketCoach;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("springProgram5.xml");
    	ClassA obj = (ClassA)ac.getBean("classA",ClassA.class);
    	System.out.println(obj);
//    	Why I can't able to use toString Method it gives Exception.
    	((ClassPathXmlApplicationContext)ac).close();
	}

}
