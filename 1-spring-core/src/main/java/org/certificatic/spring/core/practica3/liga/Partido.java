package org.certificatic.spring.core.practica3.liga;

import lombok.Data;

@Data
public class Partido {
	private String nombre;

	public void saludar() {
		System.out.println("Hola soy un Evento");
		System.out.println("Me llamo: " + this.nombre 
				+ "[" + Integer.toHexString(super.hashCode()) + "]");
	}
}
