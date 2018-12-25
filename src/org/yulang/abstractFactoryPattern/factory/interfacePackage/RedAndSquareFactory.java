package org.yulang.abstractFactoryPattern.factory.interfacePackage;

import org.yulang.abstractFactoryPattern.factory.ColorFactory;
import org.yulang.abstractFactoryPattern.factory.ShapeFactory;
import org.yulang.abstractFactoryPattern.interfacePackage.Color;
import org.yulang.factoryPattern.interfacePackage.Shape;

/**
 * 产品链模式，当我们选择一个图形时，会同样有一套的东西，比如红色的正方形
 * @author lsihao
 *
 */
public class RedAndSquareFactory implements AbstractFactory{

	@Override
	public Shape createShape() {
		// TODO Auto-generated method stub
		return ShapeFactory.getShape(Shape.SQUARE);
	}

	@Override
	public Color createColor() {
		// TODO Auto-generated method stub
		return ColorFactory.getColor(Color.RED);
	}

}
