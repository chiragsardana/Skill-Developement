package Program11;

public class ClassB {
	private ClassC classc;
	public ClassB() {
		super();
	}

	public ClassB(ClassC classc) {
		super();
		this.classc = classc;
	}

	
	public String getName() {
		return classc.getName();
	}

	public void setName(String name) {
		classc.setName(name);
	}
	
	public ClassC getClassc() {
		return classc;
	}

	public void setClassc(ClassC classc) {
		this.classc = classc;
	}

	@Override
	public String toString() {
		return "ClassB [classc=" + classc + "]";
	}
	
}
