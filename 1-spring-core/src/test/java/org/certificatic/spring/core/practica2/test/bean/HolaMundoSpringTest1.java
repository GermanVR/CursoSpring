package org.certificatic.spring.core.practica2.test.bean;

import org.certificatic.spring.core.practica2.bean.HolaMundo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HolaMundoSpringTest1 {

	@Test
	public void holaMundoNoSpringTest() {
		log.info("holaMundoNoSpringTest -------------------------");

		String ruta = "spring/practica2/beans.xml";
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(ruta));
		HolaMundo holaMundo = (HolaMundo) factory.getBean("holaMundoBean");
		Assert.assertNotNull(holaMundo);
		Assert.assertNotNull(holaMundo.getMensaje());
		Assert.assertEquals("Hola Mundo Con Spring", holaMundo.getMensaje());
		log.info("{}", holaMundo);
		// Implementar IoC con BeanFactory

	}
}
