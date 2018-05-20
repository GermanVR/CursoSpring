package org.certificatic.spring.validation.practica31.validator;

import org.springframework.validation.Errors;
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

	}

}
