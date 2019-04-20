package com.codewnw.jm3190309.spring.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD })
@Constraint(validatedBy = RegistrationCodeValidator.class)
public @interface RegistrationCode {
	String prefix() default "REG";

	String message() default "Registration code should start with REG";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
