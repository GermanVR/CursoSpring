package org.certificatic.spring.core.practica15.test.autowired.constructor;

import org.certificatic.spring.core.practica15.autowired.constructor.bean.Engineer;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredConstructorAnnotationTest {

	@Test
	public void autowiredConstructorAnnotationTest() {

		log.info("autowiredConstructorAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-constructor-application-context.xml";

		// Implementar
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);

		Engineer e = ctx.getBean(Engineer.class);

		Assert.assertNotNull(e);
		Assert.assertNotNull(e.getDni());
		Assert.assertNotNull(e.getName());
		Assert.assertNotNull(e.getAge());
		Assert.assertNotNull(e.getNotebook());
		Assert.assertNotNull(e.getPen());

		log.info("Enginner: {}", e);
	}

}
