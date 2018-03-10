package org.certificatic.spring.core.practica10.beanpostprocessors.bpp;

import org.certificatic.spring.core.practica10.beanpostprocessors.bean.IWorker;
import org.certificatic.spring.core.practica10.beanpostprocessors.bean.Worker;

public class WorkerProxy implements IWorker {

	private Worker target;

	public WorkerProxy(Worker w) {
		this.target = w;
	}

	@Override
	public String getName() {
		return target.getName();
	}

	@Override
	public void setName(String name) {
		target.setName(name);
	}

	@Override
	public int getAge() {
		return target.getAge();
	}

	@Override
	public void setAge(int age) {
		target.setAge(age);
	}

	@Override
	public void init() {
		target.init();
	}

	@Override
	public void showInfo() {
		System.out.println("[proxy] aqui puedo hacer algo antes");
		target.showInfo();
		System.out.println("[proxy] aqui puedo hacer algo despues");
	}

	@Override
	public void destroy() {
		target.destroy();
	}

}
