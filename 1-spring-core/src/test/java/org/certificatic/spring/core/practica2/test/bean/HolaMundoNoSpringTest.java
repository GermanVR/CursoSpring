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
		HolaMundo h = new HolaMundo("Hello");		
		// Crear instancia de HolaMundo
		Assert.assertNotNull(h);
		Assert.assertNotNull(h.getMensaje());
		log.info("{}", h);
	}
}
