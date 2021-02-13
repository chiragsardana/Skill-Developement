package ncu.MavenSpringProgram2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springProgram2.xml");
		System.out.println("Bean Factory Called.");
		
		CRUD obj = (CRUD)context.getBean("OracleDAO");
		System.out.println(obj);
		
		CRUD obj2 = (CRUD)context.getBean("MySQLDAO");
		System.out.println(obj2);
		
		CRUD obj3 = (CRUD)context.getBean("PosGresDAO");
		System.out.println(obj3);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
