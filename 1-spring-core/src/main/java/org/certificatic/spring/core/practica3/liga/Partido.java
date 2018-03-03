package org.certificatic.spring.core.practica3.liga;

import lombok.Data;

@Data
public class Partido {
	private String nombre;
	
	public void saludar() {
		System.out.println("hola soy un partido");
		System.out.println("me llamo: " + this.nombre + " ["
				+Integer.toHexString(super.hashCode()) + "]");
	}
}
