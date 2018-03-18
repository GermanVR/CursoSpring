package org.certificatic.spring.core.practica15.test.autowired.methods;

import org.certificatic.spring.core.practica15.autowired.methods.bean.Student;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AutowiredMethodsAnnotationTest {

	@Test
	public void autowiredMethodsAnnotationTest() {

		log.info("autowiredMethodsAnnotationTest -------------------");

		String ctxFile = "spring/practica15/annotations-autowired-methods-application-context.xml";

		// Implementar

		ApplicationContext ctx = new ClassPathXmlApplicationContext(ctxFile);

		Student s = ctx.getBean(Student.class);

		log.info("Student: {}", s);
		Assert.assertNotNull(s);
		Assert.assertNotNull(s.getName());
		Assert.assertNotNull(s.getDni());
		Assert.assertNotNull(s.getAge());
		Assert.assertNotNull(s.getNotebook());
		Assert.assertNotNull(s.getPen());
	}

}
