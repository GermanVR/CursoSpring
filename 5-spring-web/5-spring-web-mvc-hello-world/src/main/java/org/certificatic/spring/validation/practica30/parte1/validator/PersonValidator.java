package org.certificatic.spring.validation.practica30.parte1.validator;

import org.certificatic.spring.validation.practica30.parte1.domain.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// Implementar
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// Implementar Validaci�n
		Person per = (Person) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "", "Enter your name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "", "Enter your age");

	}

}
