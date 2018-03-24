package org.certificatic.spring.core.practica20.test.resources;

import org.certificatic.spring.core.practica20.test.resources.utils.ResourcesTestUtils;
import org.junit.AfterClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ResourceFileSystemXmlApplicationContextTest {

	private static ApplicationContext applicationContext = new FileSystemXmlApplicationContext();

	@AfterClass
	public static void releaseApplicationContext() {
		((AbstractApplicationContext) applicationContext).close();
	}

	@Test
	public void loadTextFileFileSystemXmlApplicationContextTest() {

		log.info(
				"loadTextFileFileSystemXmlApplicationContextTest -------------------");

		// load resource c:/certificatic-resources/my-text-file.txt
		Resource resource = applicationContext.getResource("/home/darqko/Escritorio/my-text-file.txt");

		ResourcesTestUtils.loadTextFile(resource);
		// loadTextFile from resource
	}

	@Test
	public void loadPropertiesFileFileSystemXmlApplicationContextTest() {

		log.info(
				"loadPropertiesFileFileSystemXmlApplicationContextTest -------------------");

		// load resource classpath:spring/practica20/my-properties.properties
		Resource resource = applicationContext.getResource("classpath:spring/practica20/my-properties.properties");

		// loadTextFile from resource
		ResourcesTestUtils.loadPropertiesFile(resource);

	}

	@Test
	public void loadUrlFileFileSystemXmlApplicationContextTest() {

		log.info(
				"loadUrlFileFileSystemXmlApplicationContextTest -------------------");

		// load resource http://spring.io/
		Resource resource = applicationContext.getResource("http://spring.io/");

		// loadURLFile from resource
		ResourcesTestUtils.loadURLFile(resource);
	}

	@Test
	public void loadAndCopyImageFileFileSystemXmlApplicationContextTest() {

		log.info(
				"loadAndCopyImageFileFileSystemXmlApplicationContextTest -------------------");

		// load resource src/main/resources/spring/practica20/logo.png

		// loadAndCopyImage from resource
	}
}
