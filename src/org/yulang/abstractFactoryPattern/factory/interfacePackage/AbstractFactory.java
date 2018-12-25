package org.yulang.abstractFactoryPattern.factory.interfacePackage;

import org.yulang.abstractFactoryPattern.interfacePackage.Color;
import org.yulang.factoryPattern.interfacePackage.Shape;

public interface AbstractFactory {
	Shape createShape();
	Color createColor();
}
