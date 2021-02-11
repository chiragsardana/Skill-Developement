package Program11;

public class ClassA {
	private ClassB classb;
	public ClassA() {
		super();
	}

	public ClassA(ClassB classb) {
		super();
		this.classb = classb;
	}

	
	public String getName() {
		return classb.getName();
	}

	public void setName(String name) {
		classb.setName(name);
	}
	
	public ClassB getClassb() {
		return classb;
	}

	public void setClassb(ClassB classb) {
		this.classb = classb;
	}

	@Override
	public String toString() {
		return "ClassA [classb=" + classb + "]";
	}
	
}
