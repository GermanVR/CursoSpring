package org.certificatic.spring.core.practica21.methodinjection.bean;

import org.certificatic.spring.core.practica21.methodinjection.bean.api.IProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SingletonBeanNoRecomendado {

	public SingletonBeanNoRecomendado() {
		System.out.println("New SingletonBean ");
	}

	private ApplicationContext applicationContext;

	@Value("3")
	private @Setter Integer iterations;

	// Inyecta un prototype IProcessor en este bean singleton (¿¿¿¿¿como????)
	// private IProcessor processor;

	public String process(String data) {
		log.info("SingletonBean id [{}]: sending to process data ...", super.hashCode());
		IProcessor processor = createProcessor();
		return processor.processData(data, iterations);
	}

	public IProcessor createProcessor() {
		return applicationContext.getBean(IProcessor.class);

	}

}
// Define la estructura para inyectar m�todos en �ste bean