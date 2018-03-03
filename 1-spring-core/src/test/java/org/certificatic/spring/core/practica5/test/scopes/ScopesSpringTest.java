package org.certificatic.spring.core.practica5.test.scopes;

import org.certificatic.spring.core.practica5.scopes.bean.Persona;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ScopesSpringTest {

	private static ApplicationContext applicationContext;

	@BeforeClass
	public static void beforeClass() {
		String ruta = "spring/practica5/scopes-application-context.xml";
		applicationContext = new ClassPathXmlApplicationContext(ruta);
		log.info("Ya estoy Listo!!!");
	}

	@Test
	public void scopeSingletonSpringTest() {

		log.info("scopeSingletonSpringTest -------------------");

		log.info("Prototype");
		for (int i = 0; i < 3; i++) {
			Persona pP = applicationContext.getBean("personaPrototypeBean", Persona.class);
			Assert.assertNotNull(pP);
			log.info("Persona: {} {} {}", pP, pP.hashCode(), System.identityHashCode(pP));
		}

		log.info("Singelton");
		for (int i = 0; i < 3; i++) {
			Persona pS = applicationContext.getBean("personaSingletonBean", Persona.class);
			Assert.assertNotNull(pS);
			log.info("Persona: {} {} {}", pS, pS.hashCode(), System.identityHashCode(pS));
		}
		// Implementar
	}

	@Test
	public void scopePrototypeSpringTest() {

		log.info("scopePrototypeSpringTest -------------------");

		// Implementar

	}
}
