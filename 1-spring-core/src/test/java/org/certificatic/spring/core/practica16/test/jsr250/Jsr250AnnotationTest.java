package org.certificatic.spring.core.practica16.test.jsr250;

import org.certificatic.spring.core.practica16.jsr250.bean.Student;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Jsr250AnnotationTest {

	private static ConfigurableApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica16/annotations-jsr250-application-context.xml");
	}

	@Test
	public void jsr250AnnotationTest() {

		log.info("jsr250AnnotationTest -------------------");

		// Implementar
		Student s = applicationContext.getBean(Student.class);
		Assert.assertNotNull(s);
		Assert.assertNotNull(s.getEnrollment());
		Assert.assertNotNull(s.getName());
		Assert.assertNotNull(s.getMathematics());
		Assert.assertEquals("Ivan García", s.getName());
		Assert.assertEquals("2008630474", s.getEnrollment());
		Assert.assertTrue("2008630474".equals(s.getEnrollment()));
		log.info("Student: {}", s);

	}

	@AfterClass
	public static void afterClass() {
		((AbstractApplicationContext) applicationContext).close();
	}
}
