package org.certificatic.spring.core.practica6.test.initdestroy;

import org.aspectj.lang.annotation.After;
import org.certificatic.spring.core.practica6.initdestroy.bean.ConnectionDataBase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InitDestroyTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		// Instanciar ApplicationContext
		applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica6/init-destroy-application-context.xml");
	}

	@AfterClass
	public static void AfterClass() {
		// Instanciar ApplicationContext
		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void initDestroyTest() {

		log.info("initDestroyTest -------------------");

		// Implementar
		ConnectionDataBase con = applicationContext.getBean(ConnectionDataBase.class);
		Assert.assertNotNull(con);
		Assert.assertNotNull(con.getDatabase());
		Assert.assertNotNull(con.getPassword());
		Assert.assertNotNull(con.getUser());
	}

}
