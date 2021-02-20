package ncu.MavenSpringProgram7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springProgram7.xml");
    	ProtoType obj = (ProtoType)ac.getBean("protoType",ProtoType.class);
    	
//    	ProtoType obj1 = (ProtoType)ac.getBean("protoType",ProtoType.class);
    	
    	((ClassPathXmlApplicationContext)ac).close();
//    	In Case of Prototype Scoped Beans Spring Does not call the @PreDestroy
	}
}
