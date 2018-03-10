package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.Worker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import lombok.Getter;

public class BeanPostProcessor3 implements BeanPostProcessor, Ordered {

	private @Getter int order = 3;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof Worker) {
			
			Worker w = (Worker) bean;
			
			WorkerProxy wp = new WorkerProxy(w);
			bean = wp;
		}
		return bean;
	}

}