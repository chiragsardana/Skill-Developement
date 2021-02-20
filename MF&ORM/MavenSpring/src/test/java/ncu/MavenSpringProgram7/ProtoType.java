package ncu.MavenSpringProgram7;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("protoType")
public class ProtoType implements DisposableBean{

	public ProtoType() {
		System.out.println("Object of Prototype Class "
				+ "is created");
	}
	@PostConstruct
    public void init() throws Exception 
    { 
        System.out.println("init() method of Prototype "
        		+ " Class"); 
    } 
// 	In Case of Prototype we can't call PreDestory Method
    @PreDestroy
    public void destroy() throws Exception 
    { 
        System.out.println( "destroy() method of "
        		+ "Prototype Class");
        close();
    } 
    public void close() {
		System.out.println("Closing All Resources"
				+ " of Prototype Class");
	}
}
