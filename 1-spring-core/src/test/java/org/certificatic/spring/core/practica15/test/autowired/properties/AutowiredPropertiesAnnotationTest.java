package org.certificatic.spring.core.practica15.test.autowired.properties;

import org.certificatic.spring.core.practica15.autowired.properties.bean.Reporter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredPropertiesAnnotationTest {

	@Test
	public void autowiredPropertiesAnnotationTest() {

		log.info("autowiredPropertiesAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-property-application-context.xml";

		// Implementar
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);
		Reporter r = ctx.getBean(Reporter.class);

		Assert.assertNotNull(r);
		Assert.assertNotNull(r.getDni());
		Assert.assertNotNull(r.getName());
		Assert.assertNotNull(r.getAge());
		Assert.assertNotNull(r.getNotebook());
		Assert.assertNotNull(r.getPen());

		log.info("PEncil {}", r);
	}

}
