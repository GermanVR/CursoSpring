package org.certificatic.spring.core.practica9.test.beandefinheritance.bean;

import org.certificatic.spring.core.practica9.beandefinitioninheritance.bean.ConnectionDataBase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanDefinitionInheritanceTest {

	@Test
	public void beanDefinitionInheritanceTest1() {

		log.info("beanDefinitionInheritanceTest1 -------------------");

		// Implementar
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context.xml");

		ConnectionDataBase prod = applicationContext.getBean("connectionProdBean", 
				ConnectionDataBase.class);

		Assert.assertNotNull(prod);
		Assert.assertEquals("produccionDB001", prod.getDatabase());

		ConnectionDataBase test = applicationContext.getBean("connectionTestBean", 
				ConnectionDataBase.class);

		Assert.assertNotNull(test);
		Assert.assertEquals("pruebasDB001", test.getDatabase());

		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void beanDefinitionInheritanceTest2() {

		log.info("beanDefinitionInheritanceTest2 -------------------");

		// Implementar
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring/practica9/bean-def-inheritance-application-context2.xml");

		ConnectionDataBase prod = applicationContext.getBean("connectionProdBean", 
				ConnectionDataBase.class);

		Assert.assertNotNull(prod);
		Assert.assertEquals("produccionDB001", prod.getDatabase());

		ConnectionDataBase test = applicationContext.getBean("connectionTestBean", 
				ConnectionDataBase.class);

		Assert.assertNotNull(test);
		Assert.assertEquals("pruebasDB001", test.getDatabase());

		((AbstractApplicationContext) applicationContext).close();
	}

}
