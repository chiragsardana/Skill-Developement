package ncu.MavenSpringProgram5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classA")
@Scope("singleton") //Scope using Annotation
public class ClassA {

	private ClassB classB;
	@Autowired
	public ClassA(@Lazy ClassB classB) {
		super();
		this.classB = classB;
	}
	@Override
	public String toString() {
		return "ClassA [classB=" + classB + "]";
	}
	
}
