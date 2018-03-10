package org.certificatic.spring.core.practica8.test.factorymethod;

import org.certificatic.spring.core.practica8.factorymethod.bean.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryMethodTest {

	private static ApplicationContext applicationContext;

	@Before
	public void beforeClass() {
		// Instanciar ApplicationContext
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica8/factory-method-application-context.xml");
	}

	@After
	public void afterClass() {
		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void factoryMethodTest() {

		log.info("factoryMethodTest -------------------");

		// Implementar
		Student student = applicationContext.getBean("student1", Student.class);

		Assert.assertNotNull(student);
		Assert.assertEquals("Javier Gómez", student.getName());
		Assert.assertEquals("Progra I", student.getSubject().getName());
	}

	@Test
	public void factoryMethodTest2() {

		log.info("factoryMethodTest2 -------------------");

		// Implementar
		Student student = applicationContext.getBean("student2", Student.class);

		Assert.assertNotNull(student);
		Assert.assertEquals("Alma Pérez", student.getName());
		Assert.assertEquals("Mate Discretas", student.getSubject().getName());
	}

}
