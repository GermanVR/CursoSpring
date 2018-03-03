package org.certificatic.spring.core.practica5.scopes.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Persona {

	private String nombre = "Ivan";

	public Persona() {
		log.info("Construyendo Persona()");
	}
}
