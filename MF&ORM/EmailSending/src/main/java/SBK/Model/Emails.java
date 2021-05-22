package SBK.Model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Emails {
	public Emails() {
		super();
	}
	public Emails(@Email String mailTo, @NotEmpty String subject, String message, String fileName) {
		super();
		this.mailTo = mailTo;
		this.subject = subject;
		this.message = message;
		this.fileName = fileName;
	}
	@Email
	private String mailTo;
	@NotEmpty
	private String subject;
	@NotEmpty
	private String message;
	private String fileName;
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
