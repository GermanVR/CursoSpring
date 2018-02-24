package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import org.certificatic.practica1.interfaces.livingbeing.api.ILivingBeing;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public abstract class Animal implements ILivingBeing {
	private @Getter @Setter String type = "Animal";
	private @Getter @Setter String subType;
}
