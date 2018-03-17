package org.certificatic.spring.core.practica17.stereotypes.api.restcontrollers.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IRestController;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Data
// Anotar rest controlador, implementar Interface IRestControllerClass
@RestController
public class MyRestController implements IRestController {

	// Inyectar con "resource" bean name
	@Resource(name = "myRestControllerName")
	private String name;
}
