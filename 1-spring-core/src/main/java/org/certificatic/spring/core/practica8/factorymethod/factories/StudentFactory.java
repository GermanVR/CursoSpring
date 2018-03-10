package org.certificatic.spring.core.practica8.factorymethod.factories;

import org.certificatic.spring.core.practica8.factorymethod.bean.Student;
import org.certificatic.spring.core.practica8.factorymethod.bean.Subject;
import org.certificatic.spring.core.practica8.factorymethod.bean.Teacher;

public class StudentFactory {

	public Student buildStudent(String name, String materia) {
		Student a = new Student();
		a.setName(name);
		a.setSubject(new Subject());
		a.getSubject().setName(materia);
		a.getSubject().setTeacher(new Teacher());
		a.getSubject().getTeacher().setName("Ivan");
		return a;
	}
}
