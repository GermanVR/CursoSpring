package org.certificatic.spring.aop.util.bean.api.impl;

import org.certificatic.spring.aop.util.Color;
import org.certificatic.spring.aop.util.bean.api.IColorWriter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SimpleWriter implements IColorWriter {

	@Override
	public String getColoredMessage(Color color, String mensaje) {
		return "[ " + color.getColor() + " ] " + mensaje;
	}

}
