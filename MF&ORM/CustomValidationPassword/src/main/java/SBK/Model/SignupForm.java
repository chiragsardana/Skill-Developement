package SBK.Model;

import javax.validation.constraints.NotNull;

import SBK.Validator.Password;

public class SignupForm {
	public SignupForm() {
		super();
	}
	public SignupForm(String firstName, String lastName, String userId, String pwd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.pwd = pwd;
	}
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String userId;
	@Password
	private String pwd;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
