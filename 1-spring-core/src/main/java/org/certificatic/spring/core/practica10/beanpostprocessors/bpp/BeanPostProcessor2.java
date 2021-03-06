package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.Worker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

import lombok.Getter;

public class BeanPostProcessor2 implements BeanPostProcessor, Ordered {

	private @Getter int order = 2;

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;
			w.setName("Pancho");
			System.out.println("[BPP Before Init " + this.order + "]: Worker name: " + w.getName());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if (bean instanceof Worker) {
			Worker w = (Worker) bean;
			w.setName("Martha");
			System.out.println("[BPP After Init " + this.order + "]: Worker name: " + w.getName());
		}
		return bean;
	}

}