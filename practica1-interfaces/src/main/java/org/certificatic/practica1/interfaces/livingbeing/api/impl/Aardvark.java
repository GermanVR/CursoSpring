package org.certificatic.practica1.interfaces.livingbeing.api.impl;

import javax.sound.midi.Track;

import org.certificatic.practica1.interfaces.livingbeing.api.IBugEater;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Aardvark extends Animal implements IBugEater {

	public Aardvark(String subType) {
		this.setSubType(subType);
	}

	@Override
	public void born() {
		System.out.println("born like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	@Override
	public void grow() {
		System.out.println("grow like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	@Override
	public void breed() {
		System.out.println("breed like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	@Override
	public void die() {
		System.out.println("die like a " + this.getType() + " (" + this.getSubType() + ")");
	}

	@Override
	public void eatBug() {
		System.out.println("eatBug like a " + this.getType() + " (" + this.getSubType() + ")");
	}
}
