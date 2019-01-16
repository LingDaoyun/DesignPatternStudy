package org.yulang.prototypePattern.impl;

import org.yulang.prototypePattern.abstractPkg.Shape;

public class Circle extends Shape {

	public Circle() {
		type="Circle";
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle :: draw() method . ");
	}

}
