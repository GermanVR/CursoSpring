package org.certificatic.spring.core.practica3.liga;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Torneo {
	private @Setter(AccessLevel.NONE) String nombre;
	private @Setter(AccessLevel.NONE) Evento evento;
	
	public void saludar() {
		System.out.println("hola soy un torneo");
		System.out.println("me llamo: " + this.nombre + " ["
				+Integer.toHexString(super.hashCode()) + "]");
	}
}
