package ncu.MavenSpringProgram11;

import org.springframework.stereotype.Component;

//@Component("employee")
public class Employee {
	private String name;
	private Integer age;
//	private Address address;
	private Integer no_of_working_days;
//	public Employee(String name, Integer age, Address address, Integer no_of_working_days) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.address = address;
//		this.no_of_working_days = no_of_working_days;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getNo_of_working_days() {
		return no_of_working_days;
	}
	public void setNo_of_working_days(Integer no_of_working_days) {
		this.no_of_working_days = no_of_working_days;
	}
	public Double calculateSalary() {
		Double salaryPerDay = new Double("1000.0");
		return getNo_of_working_days() * salaryPerDay;
	}
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}
}
