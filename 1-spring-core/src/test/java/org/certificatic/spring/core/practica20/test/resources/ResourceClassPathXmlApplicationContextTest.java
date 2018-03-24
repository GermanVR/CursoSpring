package org.certificatic.spring.core.practica20.test.resources;

import org.certificatic.spring.core.practica20.test.resources.utils.ResourcesTestUtils;
import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResourceClassPathXmlApplicationContextTest {

	private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext();

	@AfterClass
	public static void releaseApplicationContext() {
		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void loadTextFileClasspathXmlApplicationContextTest() {

		log.info("loadTextFileClasspathXmlApplicationContextTest -------------------");
		// loadTextFile from resource
		Resource resource = applicationContext.getResource("file:/home/darqko/Escritorio/my-text-file.txt");

		// load resource file:c:/certificatic-resources/my-text-file.txt
		ResourcesTestUtils.loadTextFile(resource);
	}

	@Test
	public void loadPropertiesFileClasspathXmlApplicationContextTest() {

		log.info("loadPropertiesFileClasspathXmlApplicationContextTest -------------------");

		// load resource spring/practica20/my-properties.properties
		Resource resource = applicationContext.getResource("spring/practica20/my-properties.properties");

		// loadPropertiesFile from resource
		ResourcesTestUtils.loadTextFile(resource);
	}

	@Test
	public void loadUrlFileClasspathXmlApplicationContextTest() {

		log.info("loadUrlFileClasspathXmlApplicationContextTest -------------------");

		// load resource http://spring.io/
		Resource resource = applicationContext.getResource("http://spring.io/");

		// loadTextFile from resource
		ResourcesTestUtils.loadURLFile(resource);
		// loadURLFile from resource
	}

	@Test
	public void loadAndCopyImageFileClasspathXmlApplicationContextTest() {

		log.info("loadAndCopyImageFileClasspathXmlApplicationContextTest -------------------");

		// load resource file:src/main/resources/spring/practica20/logo.png
		Resource resource = applicationContext.getResource("file:src/main/resources/spring/practica20/logo.png");
		// loadAndCopyImage from resource

		ResourcesTestUtils.loadAndCopyImage(resource, "src/main/resources/spring/practica20/copy-classpath/");
	}
}
