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
		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);
		
		Journalist journalist = ctx.getBean(Journalist.class);
		
		Assert.assertNotNull(journalist);
		Assert.assertNull(journalist.getDni());
		Assert.assertNotNull(journalist.getName());
		Assert.assertNotNull(journalist.getAge());
		Assert.assertNotNull(journalist.getNotebook());
		Assert.assertNotNull(journalist.getPen());
		
		log.info("journalist: {}", journalist);
		
		((AbstractApplicationContext)ctx).close();
	}

}
