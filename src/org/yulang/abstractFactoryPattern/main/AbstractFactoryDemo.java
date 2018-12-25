package org.yulang.abstractFactoryPattern.main;

import org.yulang.abstractFactoryPattern.factory.interfacePackage.AbstractFactory;
import org.yulang.abstractFactoryPattern.factory.interfacePackage.RedAndSquareFactory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory af = new RedAndSquareFactory();
		createProductLine(af);
	}
	public static void createProductLine(AbstractFactory af) {
		af.createColor().fill();
		af.createShape().draw();
	}
}
