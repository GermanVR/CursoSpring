package org.certificatic.spring.core.practica15.test.required;

import org.certificatic.spring.core.practica15.required.bean.Cameraman;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequiredAnnotationTest {

	@Test
	public void requiredAnnotationTest() {

		log.info("requiredAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-required-application-context.xml";

		// Implementar
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);
		Cameraman c = ctx.getBean("okCameraman", Cameraman.class);

		Assert.assertNotNull(c);
		Assert.assertNotNull(c.getDni());
		Assert.assertNotNull(c.getName());
		Assert.assertNull(c.getAge());

		log.info("Cameraman: {}", c);
		((AbstractApplicationContext) ctx).close();
	}

	@Test(expected = BeanCreationException.class)
	public void badRequiredAnnotationTest() {

		log.info("badRequiredAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-required-application-context.xml";

		// Implementar
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);
		Cameraman c = ctx.getBean("badCameraman", Cameraman.class);

		Assert.fail("El test tendria que fallar");

		log.info("Cameraman: {}", c);
		((AbstractApplicationContext) ctx).close();

	}

}
