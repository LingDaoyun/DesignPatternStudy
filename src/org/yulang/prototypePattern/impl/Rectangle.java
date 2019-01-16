package org.yulang.prototypePattern.impl;

import org.yulang.prototypePattern.abstractPkg.Shape;

public class Rectangle extends Shape {

	public Rectangle() {
		type="Rectangle";
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside  Rectangle :: draw() method . ");
	}

}
