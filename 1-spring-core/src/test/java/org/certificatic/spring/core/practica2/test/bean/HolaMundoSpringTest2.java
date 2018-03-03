package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest2 {

	@Test
	public void holaMundoSpringTest2() {
		log.info("holaMundoSpringTest2 -------------------------");

		String ruta = "spring/practica2/beans.xml";

		// Implementar IoC con ApplicationContext
		ApplicationContext appliationContext = new ClassPathXmlApplicationContext(ruta);

		HolaMundo hola = (HolaMundo) appliationContext.getBean("holaMundoBean2");

		Assert.assertNotNull(hola);
		Assert.assertNotNull(hola.getMensaje());

		Assert.assertEquals("Hola Mundo con Spring !", hola.getMensaje());

		log.info("hola: {}", hola);

	}
}
