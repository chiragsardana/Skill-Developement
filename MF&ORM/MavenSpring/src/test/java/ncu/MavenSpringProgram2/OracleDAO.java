package ncu.MavenSpringProgram2;

public class OracleDAO implements CRUD {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Create method of "+this.toString());
	}

	@Override
	public String read() {
		// TODO Auto-generated method stub
		return "Read method of "+this.toString();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Update method of "+this.toString());
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Delete method of "+this.toString());
	}

	@Override
	public String toString() {
		return "OracleDAO []";
	}

}
