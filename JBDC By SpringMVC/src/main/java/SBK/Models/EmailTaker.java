package SBK.Models;

public class EmailTaker {
	public EmailTaker() {
		super();
	}

	public EmailTaker(String email_id) {
		super();
		this.email_id = email_id;
	}

	private String email_id;

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
}
