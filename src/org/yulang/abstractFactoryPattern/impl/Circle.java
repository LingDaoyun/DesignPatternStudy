package org.yulang.abstractFactoryPattern.impl;

import org.yulang.factoryPattern.interfacePackage.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle :: draw() method");
	}

}
