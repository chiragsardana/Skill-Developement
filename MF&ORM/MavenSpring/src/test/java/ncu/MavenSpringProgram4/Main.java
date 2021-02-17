package ncu.MavenSpringProgram4;


import java.io.FileNotFoundException;

/*
. Define a new implementation for the FortuneService.
Your fortune service should read the fortunes from a file.   
The fortune service should load the fortunes into an array   
When the getFortune() method is called it would return a random fortune from the array.   
 
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("springProgram4.xml");
    	CricketCoach cricket = (CricketCoach)ac.getBean("cricketCoach",CricketCoach.class);
    	System.out.println(cricket.getFortune());
    	
    	((ClassPathXmlApplicationContext)ac).close();
    }

}