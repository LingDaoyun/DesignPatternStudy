package org.yulang.factoryPattern.factory;

import org.yulang.factoryPattern.impl.Circle;
import org.yulang.factoryPattern.impl.Rectangle;
import org.yulang.factoryPattern.impl.Square;
import org.yulang.factoryPattern.interfacePackage.Shape;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if(null == shapeType) {
			return null;
		}else if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
