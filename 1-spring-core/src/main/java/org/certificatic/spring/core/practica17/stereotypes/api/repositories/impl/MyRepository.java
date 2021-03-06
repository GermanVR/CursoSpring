package org.certificatic.spring.core.practica17.stereotypes.api.repositories.impl;

import javax.annotation.Resource;

import org.certificatic.spring.core.practica17.stereotypes.api.IRepository;
import org.springframework.stereotype.Repository;

import lombok.Data;

@Data
// Anotar repositorio, implementar Interface IRepositoryClass
@Repository
public class MyRepository implements IRepository{

	// Inyectar con "resource" bean name
	@Resource(name = "myRepositoryName")
	private String name;
}
