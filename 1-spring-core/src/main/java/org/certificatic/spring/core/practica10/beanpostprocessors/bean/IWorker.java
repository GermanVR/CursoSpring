package org.certificatic.spring.core.practica10.beanpostprocessors.bean;

public interface IWorker {

	String getName();

	void setName(String name);

	int getAge();

	void setAge(int age);

	public void init();

	public void showInfo();

	public void destroy();

}
