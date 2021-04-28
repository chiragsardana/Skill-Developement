package SBK.Model;

import javax.validation.constraints.NotNull;

import SBK.Validator.Password;

public class Users {
	public Users() {
		super();
	}
	public Users(String userId, String pwd) {
		super();
		this.userId = userId;
		this.pwd = pwd;
	}
	@NotNull
	private String userId;
	@Password(value = "sardana")
	private String pwd;
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
