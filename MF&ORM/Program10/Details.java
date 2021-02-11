package Program10;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Details {
	
	private List<String> names;
	private Set<Long> Phno;
	private Map<Long, String> aadharNo;
	private Map<Long, Address> address;
	private Properties email;
	public Details() {
		super();
		System.out.println("No Parameterised Constructor");
		
	}
	public Details(List<String> names, Set<Long> phno, Map<Long, String> aadharNo, Map<Long, Address> address,
			Properties email) {
		super();
		System.out.println("Parameterised Constructor");
		this.names = names;
		Phno = phno;
		this.aadharNo = aadharNo;
		this.address = address;
		this.email = email;
	}
	
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public Set<Long> getPhno() {
		return Phno;
	}
	public void setPhno(Set<Long> phno) {
		Phno = phno;
	}
	public Map<Long, String> getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(Map<Long, String> aadharNo) {
		this.aadharNo = aadharNo;
	}
	public Map<Long, Address> getAddress() {
		return address;
	}
	public void setAddress(Map<Long, Address> address) {
		this.address = address;
	}
	public Properties getEmail() {
		return email;
	}
	public void setEmail(Properties email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [names=" + names + ", Phno=" + Phno + ", aadharNo=" + aadharNo + ", address=" + address
				+ ", email=" + email + "]";
	}
	public void initMethod() {
		System.out.println("Init Method of Detail Class.");
	}
	public void destroyMethod() {
		System.out.println("Destroy Method of Detail Class.");
	}
}
