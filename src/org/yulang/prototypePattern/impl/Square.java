package org.yulang.prototypePattern.impl;

import org.yulang.prototypePattern.abstractPkg.Shape;

public class Square extends Shape {

	public Square() {
		type="Squre";
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Squre :: draw() method. ");
	}

}
