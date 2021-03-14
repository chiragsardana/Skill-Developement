package ncu.AopProgram4;

//1. Name,
//2.age,
//3. address,
//4. no_of_days working,
//5. calculate_sal()

public class Employee {
	private String name;
	private Integer age;
	private Address address;
	private Integer noOfDaysWorking;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getNoOfDaysWorking() {
		return noOfDaysWorking;
	}
	public void setNoOfDaysWorking(Integer noOfDaysWorking) {
		this.noOfDaysWorking = noOfDaysWorking;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + ", noOfDaysWorking="
				+ noOfDaysWorking + "]";
	}
	public Double calculate_sal() {
		Double salary = new Double(50.0);
		return salary * getNoOfDaysWorking();
	}
	
}
