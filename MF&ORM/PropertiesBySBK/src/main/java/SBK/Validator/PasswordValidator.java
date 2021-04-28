package SBK.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class PasswordValidator 
implements ConstraintValidator<Password, String> {
	private String coursePrefix;
	public void initialize(Password password) {
		// TODO Auto-generated method stub
		coursePrefix = password.value();
		System.out.println(coursePrefix);
	}
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(value!=null) {
			result=value.startsWith(coursePrefix);
		}
		return result;
	}

}
