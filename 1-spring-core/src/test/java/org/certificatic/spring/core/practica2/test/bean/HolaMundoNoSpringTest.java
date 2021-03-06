package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoNoSpringTest {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		// Crear instancia de HolaMundo
		
		String mensaje = "Hola mundo SIN Spring!";
		
		HolaMundo hola = new HolaMundo();
		
		hola.setMensaje(mensaje);
		
		Assert.assertNotNull(hola);
		Assert.assertNotNull(hola.getMensaje());
		
		log.info("{}",hola);

	}
}
