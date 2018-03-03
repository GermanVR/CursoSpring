package org.certificatic.spring.core.practica3.liga;

import lombok.Data;

@Data
public class Evento {
	private String nombre;
	
	public void saludar() {
		System.out.println("hola soy un evento");
		System.out.println("me llamo: " + this.nombre + " ["
				+Integer.toHexString(super.hashCode()) + "]");
	}
}
