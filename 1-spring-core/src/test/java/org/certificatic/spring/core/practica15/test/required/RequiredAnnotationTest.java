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

		Cameraman cameraman = ctx.getBean("okCameraman", Cameraman.class);

		Assert.assertNotNull(cameraman);

		Assert.assertNotNull(cameraman.getName());

		Assert.assertNotNull(cameraman.getDni());

		Assert.assertNull(cameraman.getAge());

		log.info("cameraman: {}", cameraman);

		((AbstractApplicationContext) ctx).close();
	}

	@Test(expected = BeanCreationException.class)
	public void badRequiredAnnotationTest() {

		log.info("badRequiredAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-required-application-context.xml";

		// Implementar
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);

		Cameraman cameraman = ctx.getBean("badCameraman", Cameraman.class);

		Assert.fail("El test tendría que fallar");

		((AbstractApplicationContext) ctx).close();
	}

}
