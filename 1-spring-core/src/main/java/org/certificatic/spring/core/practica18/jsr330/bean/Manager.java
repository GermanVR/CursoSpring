package org.certificatic.spring.core.practica18.jsr330.bean;

import javax.inject.Inject;
import javax.inject.Named;

import org.certificatic.spring.core.practica18.jsr330.qualifiers.ManagerEmployeeQualifier;

import lombok.Data;

@Data
@Named
public class Manager {

	@Inject
	@ManagerEmployeeQualifier
	private Employee employee;

	@Inject
	private Team team1;

	@Inject
	private Team team2;
}
