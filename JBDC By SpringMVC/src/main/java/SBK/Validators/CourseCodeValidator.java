package SBK.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator 
implements ConstraintValidator<CourseCode, String> {
	private String[] coursePrefix;
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		coursePrefix = theCourseCode.value();
		System.out.println(coursePrefix);
	}
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(value!=null) {
			for(Integer i = 0;i < coursePrefix.length;i++) {
				result=value.startsWith(coursePrefix[i]);
				if(result == true) {
					break;
				}
			}
			
		}
		return result;
	}


}
