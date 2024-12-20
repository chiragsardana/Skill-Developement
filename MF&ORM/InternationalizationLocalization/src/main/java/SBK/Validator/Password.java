package SBK.Validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;



@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	// define default course code
			public String value() default "Chirag19CSU071";
			
			// define default error message
			public String message() default "Password Error By SBK";
			
			// define default groups
			public Class<?>[] groups() default {};
			
			// define default payloads
			public Class<? extends Payload>[] payload() default {};
}
