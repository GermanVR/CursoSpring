package org.certificatic.spring.validation.practica31.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "person")
public class Person {
	private Integer id;
	private String name;
	private Integer age;
}
