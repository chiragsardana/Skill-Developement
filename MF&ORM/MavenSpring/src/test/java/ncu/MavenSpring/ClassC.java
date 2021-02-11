package ncu.MavenSpring;

public class ClassC {
	private String name;
	public ClassC() {
		super();
	}

	public ClassC(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ClassC [name=" + name + "]";
	}

	
	
}
