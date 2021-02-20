//package ncu.MavenSpringProgram7;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//@Component("singleTon")
//public class SingleTon {
//	@Autowired
//	private ProtoType protoType;
//	public SingleTon() {
//		System.out.println("Object of Singleton is "
//				+ "instantiated");
//	}
//	@PostConstruct
//    public void init() throws Exception 
//    { 
//        System.out.println("init() method of singleton"
//        		+ " Class"); 
//    } 
//	@PreDestroy
//    public void destroy() throws Exception 
//    { 
//        System.out.println( "destroy() method of "
//        		+ " singleton Class");
//        close();
//        System.out.println("Calling the Destroy Method"
//        		+ "of Prototype Class Using Object of "
//        		+ "Singleton Class");
//        protoType.destroy();
//    } 
//    public void close() {
//		System.out.println("Closing All Resources"
//				+ " of singleton Class");
//	}
//}
