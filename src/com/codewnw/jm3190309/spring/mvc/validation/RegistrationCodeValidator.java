package com.codewnw.jm3190309.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RegistrationCodeValidator implements ConstraintValidator<RegistrationCode, String> {

	String prefix;

	@Override
	public void initialize(RegistrationCode registrationCode) {
		this.prefix = registrationCode.prefix();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;
		System.out.println("Required prefix: " + prefix);
		System.out.println("User Entered: " + value);

		if (value != null) {
			result = value.startsWith(prefix);
		} else {
			result = true;
		}

		return result;
	}

}
