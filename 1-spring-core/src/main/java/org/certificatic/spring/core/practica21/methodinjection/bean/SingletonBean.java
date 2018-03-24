package org.certificatic.spring.core.practica21.methodinjection.bean;

import org.certificatic.spring.core.practica21.methodinjection.bean.api.IProcessor;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class SingletonBean {

	public SingletonBean() {
		System.out.println("New SingletonBean ");
	}

	private @Setter Integer iterations;

	// Inyecta un prototype IProcessor en este bean singleton (¿¿¿¿¿como????)

	public String process(String data) {
		log.info("SingletonBean id [{}]: sending to process data ...", super.hashCode());

		return createProcessor().processData(data, iterations);
	}

	protected abstract IProcessor createProcessor();

}
// Define la estructura para inyectar m�todos en �ste bean