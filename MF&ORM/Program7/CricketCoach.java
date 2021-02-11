package Program7;

import Program2.ICouch;
import Program2.IFortune;
import Program4.Address;

public class CricketCoach implements ICouch {

	private IFortune fortune;
	private String name;
	private String email_id;
	private Integer age;
	private Address address;
	
	public CricketCoach(IFortune fortune, String name, String email_id, Integer age, Address address) {
		super();
		this.fortune = fortune;
		this.name = name;
		this.email_id = email_id;
		this.age = age;
		this.address = address;
	}

	public CricketCoach(IFortune fortune, String name, String email_id, Integer age) {
		super();
		this.fortune = fortune;
		this.name = name;
		this.email_id = email_id;
		this.age = age;
	}

	
	public CricketCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "You Have to Do HardWork!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

	public IFortune getFortune() {
		return fortune;
	}

	public void setFortune(IFortune fortune) {
		System.out.println("Inside setFortune method.");
		this.fortune = fortune;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "CricketCoach [ name = " + name + ", email_id = " + email_id + ", age = " + age + ", address = " + address + "]";
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

}
