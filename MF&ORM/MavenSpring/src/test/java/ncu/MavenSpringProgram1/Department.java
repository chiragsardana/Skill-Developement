package ncu.MavenSpringProgram1;

public class Department {
	public Department(Integer departmentNo, String departmentName, Integer departmentPhoneNo, Address address) {
		super();
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.departmentPhoneNo = departmentPhoneNo;
		this.address = address;
	}
	public Department() {
		super();
	}
	private Integer departmentNo;
	private String departmentName;
	private Integer departmentPhoneNo;
	private Address address;
	public Department(Integer departmentNo, String departmentName, Integer departmentPhoneNo) {
		super();
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.departmentPhoneNo = departmentPhoneNo;
	}
	public Integer getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(Integer departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getDepartmentPhoneNo() {
		return departmentPhoneNo;
	}
	public void setDepartmentPhoneNo(Integer departmentPhoneNo) {
		this.departmentPhoneNo = departmentPhoneNo;
	}
	@Override
	public String toString() {
		return "Department [departmentNo=" + departmentNo + ", departmentName=" + departmentName + ", departmentPhoneNo="
				+ departmentPhoneNo + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
