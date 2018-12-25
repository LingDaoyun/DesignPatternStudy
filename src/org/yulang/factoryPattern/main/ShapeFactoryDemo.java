package org.yulang.factoryPattern.main;

import org.yulang.factoryPattern.factory.ShapeFactory;
import org.yulang.factoryPattern.interfacePackage.Shape;

public class ShapeFactoryDemo {
public static void main(String[] args) {
Shape s1 = ShapeFactory.getShape(Shape.CIRCLE);
s1.draw();
Shape s2 = ShapeFactory.getShape(Shape.RECTANGLE);
s2.draw();
Shape s3  = ShapeFactory.getShape(Shape.SQUARE);
s3.draw();
}
}
