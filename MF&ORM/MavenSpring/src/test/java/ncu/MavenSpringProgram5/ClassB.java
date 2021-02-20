package ncu.MavenSpringProgram5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("classB")
@Scope("singleton")
public class ClassB {
	private ClassA classA;
	@Autowired
	public ClassB(@Lazy ClassA classA) {
		super();
		this.classA = classA;
	}
	@Override
	public String toString() {
		return "ClassB [classA=" + classA + "]";
	}
}
