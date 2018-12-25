package org.yulang.abstractFactoryPattern.factory;

import org.yulang.abstractFactoryPattern.impl.Blue;
import org.yulang.abstractFactoryPattern.impl.Green;
import org.yulang.abstractFactoryPattern.impl.Red;
import org.yulang.abstractFactoryPattern.interfacePackage.Color;

public class ColorFactory {

	public static Color getColor(String colorType) {
		if(null == colorType) {
			throw new IllegalArgumentException("Invalid color type");
		}else if(Color.RED.equals(colorType)) {
			return new Red();
		}else if(Color.BLUE.equals(colorType)) {
			return new Blue();
		}else if(Color.GREEN.equals(colorType)) {
			return new Green();
		}
		return null;
	}
}
