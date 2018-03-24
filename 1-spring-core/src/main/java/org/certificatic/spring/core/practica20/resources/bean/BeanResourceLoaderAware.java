package org.certificatic.spring.core.practica20.resources.bean;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data
// Definir bean componente
// Implementar ResourceLoaderAware
@Component
public class BeanResourceLoaderAware implements ResourceLoaderAware {

	// Inyectar dependencia Resources
	private @Setter ResourceLoader resourceLoader;

	public Resource getTxtFile() {
		String location = "file:/Users/xvhx/certificatic-resources/my-text-file.txt";
		return resourceLoader.getResource(location);
	}

	public Resource getPropertiesFile() {
		String location = "classpath:spring/practica20/my-properties.properties";
		return resourceLoader.getResource(location);
	}

	public Resource getUrlFile() {
		String location = "https://spring.io/";
		return resourceLoader.getResource(location);
	}

	public Resource getImageFile() {
		String location = "file:src/main/resources/spring/practica20/logo.png";
		return resourceLoader.getResource(location);
	}
}
