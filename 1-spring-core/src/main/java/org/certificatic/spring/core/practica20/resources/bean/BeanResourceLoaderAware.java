package org.certificatic.spring.core.practica20.resources.bean;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
// Definir bean componente
// Implementar ResourceLoaderAware
@Component
public class BeanResourceLoaderAware implements ResourceLoaderAware {

	// Inyectar dependencia Resources
	private ResourceLoader resourceLoader;

	private Resource txtFile;
	private Resource propertiesFile;
	private Resource urlFile;
	private Resource imageFile;

	public Resource getTxtFile() {
		String location = "file:/home/darqko/Escritorio/my-text-file.txt";
		return resourceLoader.getResource(location);
	}

	public Resource getPropertiesFile() {
		String location = "classpath:spring/practica20/my-properties.properties";
		return resourceLoader.getResource(location);
	}

	public Resource getUrlFile() {
		String location = "http://spring.io/";
		return resourceLoader.getResource(location);
	}

	public Resource getImageFile() {
		String location = "file:src/main/resources/spring/practica20/logo.png";
		return resourceLoader.getResource(location);
	}
}
