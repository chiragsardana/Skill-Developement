package ncu.MavenSpringProgram10;

public class Student {
	public Student(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	private Integer age;
	private String name;
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
}
