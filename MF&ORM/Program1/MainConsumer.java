package Program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Producer producer1 = new FastProducer();//Upcasting
//		Producer producer2 = new SlowProducer();
		
//		Consumer c1 = new Consumer(Factory.getObject());
//		c1.work();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				
		// retrieve bean from spring container
//		Producer theProducer = (Producer)context.getBean("SlowProducer", SlowProducer.class);
		Consumer c2 = new Consumer((Producer)context.getBean("SlowProducer", SlowProducer.class));
		
		
		c2.work();
		
		// close the context
		//context.close();
		
//		
//		Producer c1 = Factory.getObject();
		
		
//		Consumer consumer1 = new Consumer(new FastProducer());
//		Consumer consumer2 = new Consumer(new SlowProducer());
//		
//		consumer1.work();
//		
//		consumer2.work();
		
//		Producer consumer2 = new SlowProducer();
//		consumer1.first();
//		consumer2.first();
//		System.out.println("\n\n\n");
//		consumer1.second();
//		FastProducer consumer3 = new FastProducer();
//		consumer3.first();
//		consumer3.second();
	}
}
