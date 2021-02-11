package ncu.MavenSpringProgram1;

public class Employee {
	
	public Employee() {
		super();
	}
	private Department department;
	private Address address;
	private String name;
	private Integer employeeNo;
	public Employee(Department department, Address address) {
		super();
		this.department = department;
		this.address = address;
	}
	public Employee(Department department, Address address, String name, Integer employeeNo) {
		super();
		this.department = department;
		this.address = address;
		this.name = name;
		this.employeeNo = employeeNo;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(Integer employeeNo) {
		this.employeeNo = employeeNo;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", address=" + address + ", name=" + name + ", employeeNo="
				+ employeeNo + "]";
	}
	
}
