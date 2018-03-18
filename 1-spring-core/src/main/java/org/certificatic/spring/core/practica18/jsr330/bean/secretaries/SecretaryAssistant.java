package org.certificatic.spring.core.practica18.jsr330.bean.secretaries;

import javax.inject.Inject;
import javax.inject.Named;

import org.certificatic.spring.core.practica18.jsr330.bean.Employee;
import org.certificatic.spring.core.practica18.jsr330.bean.Secretary;
import org.certificatic.spring.core.practica18.jsr330.qualifiers.EmployeOfSecretaryAssistantQualifier;
import org.certificatic.spring.core.practica18.jsr330.qualifiers.SecretaryAssistantQualifier;

@Named
@SecretaryAssistantQualifier
public class SecretaryAssistant extends Secretary {

	@Inject
	@Override
	@EmployeOfSecretaryAssistantQualifier
	public void setEmployee(Employee employee) {
		super.setEmployee(employee);
	}

}
