package ncu.MavenSpringProgram10;

public class Profile {
	public Profile(Student student) {
		super();
		this.student = student;
	}

	private Student student;

	@Override
	public String toString() {
		return "Profile [student=" + student + "]";
	}
}
