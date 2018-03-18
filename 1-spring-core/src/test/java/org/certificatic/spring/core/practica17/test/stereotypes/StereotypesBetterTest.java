package org.certificatic.spring.core.practica17.test.stereotypes;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IComponent;
import org.certificatic.spring.core.practica17.stereotypes.api.IController;
import org.certificatic.spring.core.practica17.stereotypes.api.IRepository;
import org.certificatic.spring.core.practica17.stereotypes.api.IRestController;
import org.certificatic.spring.core.practica17.stereotypes.api.IService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Implementar run with spring-test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/practica17/component-scan-stereotypes-application-context.xml")
// cargar context configuration
public class StereotypesBetterTest {

	// Inyectar todas las dependencias
	@Resource()
	private IRestController restController;

	@Resource()
	private IRestController restController2;

	@Resource()
	private IService service;

	@Resource()
	private IService service2;

	@Resource()
	private IController controller;

	@Resource()
	private IComponent component;

	@Resource()
	private IRepository repository;

	@Before
	public void beforeClass() {
		Assert.assertNotNull(restController);
		Assert.assertNotNull(restController2);
		Assert.assertNotNull(component);
		Assert.assertNotNull(service);
		Assert.assertNotNull(service2);
		Assert.assertNotNull(controller);
		Assert.assertNotNull(repository);

		Assert.assertSame(restController, restController2);
		Assert.assertNotSame(service, service2);
	}

	@Test
	public void restControllerTest() {

		log.info("restControllerTest -------------------");

		String name = "My REST Controller Implementation";

		Assert.assertNotNull(restController);
		Assert.assertEquals(name, restController.getName());

		log.info("restController: {}", restController);
	}

	@Test
	public void controllerTest() {

		log.info("controllerTest -------------------");

		String name = "My Controller Implementation";

		Assert.assertNotNull(controller);
		Assert.assertEquals(name, controller.getName());

		log.info("controller: {}", controller);
	}

	@Test
	public void componentTest() {

		log.info("componentTest -------------------");

		String name = "My Component Implementation";

		Assert.assertNotNull(component);
		Assert.assertEquals(name, component.getName());

		log.info("component: {}", component);
	}

	@Test
	public void serviceTest() {

		log.info("serviceTest -------------------");

		String name = "My Service Implementation";

		Assert.assertNotNull(service);
		Assert.assertEquals(name, service.getName());

		log.info("service: {}", service);
	}

	@Test
	public void repositoryTest() {

		log.info("repositoryTest -------------------");

		String name = "My Repository Implementation";

		Assert.assertNotNull(repository);
		Assert.assertEquals(name, repository.getName());

		log.info("repository: {}", repository);
	}

}
