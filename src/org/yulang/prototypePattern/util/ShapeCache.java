package org.yulang.prototypePattern.util;

import java.util.Hashtable;

import org.yulang.prototypePattern.impl.Rectangle;
import org.yulang.prototypePattern.abstractPkg.Shape;
import org.yulang.prototypePattern.impl.Circle;
import org.yulang.prototypePattern.impl.Square;

public class ShapeCache {
private static Hashtable<String,Shape> shapeMap = new Hashtable<>();
public static Shape getShape(String shapeId) {
	Shape cachedShape = shapeMap.get(shapeId);
	return (Shape) cachedShape.clone();
}
public static void loadCache() {
	Circle circle = new Circle();
	circle.setId("1");
	shapeMap.put(circle.getId(), circle);
	Square square = new Square();
	square.setId("2");
	shapeMap.put(square.getId(), square);
	Rectangle rectangle = new Rectangle();
	rectangle.setId("3");
	shapeMap.put(rectangle.getId(),rectangle);
}
}
