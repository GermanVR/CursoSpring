package org.certificatic.spring.core.practica15.test.autowired.requiredFalse.qualifier;

import org.certificatic.spring.core.practica15.autowired.requiredFalse.qualifier.bean.Airplane;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredRequredFalseQualifierAnnotationTest {

	@Test
	public void autowiredPropertiesAnnotationTest() {

		log.info("autowiredPropertiesAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-requiredFalse-qualifier-application-context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);
		Airplane a = ctx.getBean(Airplane.class);

		log.info("Airplane: {}", a);

		Assert.assertNotNull(a);
//		Assert.assertNotNull(a.getAirplaneCode());
		Assert.assertNotNull(a.getAirline());

		((AbstractApplicationContext) ctx).close();
		// Implementar
	}

}
