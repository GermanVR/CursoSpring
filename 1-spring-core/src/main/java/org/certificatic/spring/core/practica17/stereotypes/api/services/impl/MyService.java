package org.certificatic.spring.core.practica17.stereotypes.api.services.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
// Anotar servicio, implementar Interface IServiceClass
@Service
@Scope("prototype")
public class MyService implements IService {
	// Inyectar con "resource" bean serviceClassName
	@Resource(name = "myServiceName")
	private String name;

}
