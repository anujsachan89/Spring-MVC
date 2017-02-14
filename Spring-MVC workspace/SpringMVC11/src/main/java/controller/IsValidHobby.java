package controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


	@Documented
	@Constraint(validatedBy = HobbyValidator.class)
	@Target({ElementType.FIELD})
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface IsValidHobby{
		String listOfValidHobbies();
		String message() default "Please Provide a Valid Hobby;"+
	"accepted hobbies are - Music,Football,Cricket And Hockey (Choose anyone)";
		Class<?>[] group() default {};
		Class<? extends Payload>[] payload() default {};
	}
