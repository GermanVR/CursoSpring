package org.certificatic.spring.core.practica15.test.autowired.setter;

import org.certificatic.spring.core.practica15.autowired.setter.bean.Journalist;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredSetterAnnotationTest {

	@Test
	public void autowiredSetterAnnotationTest() {

		log.info("autowiredSetterAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-setter-application-context.xml";

		// Implementar
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(ctxFile);

		Journalist j = applicationContext.getBean(Journalist.class);

		log.info("Journalist: {}", j);
		Assert.assertNotNull(j);
		Assert.assertNotNull(j.getDni());
		Assert.assertNotNull(j.getName());
		Assert.assertNotNull(j.getAge());
		Assert.assertNotNull(j.getNotebook());
		Assert.assertNotNull(j.getPen());

		((AbstractApplicationContext) applicationContext).close();
	}

}
