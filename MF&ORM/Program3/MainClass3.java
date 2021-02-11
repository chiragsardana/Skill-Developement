package Program3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TextEditor textEditor = (TextEditor)context.getBean("myTextEditor");
		textEditor.spellchecker();
	}

}