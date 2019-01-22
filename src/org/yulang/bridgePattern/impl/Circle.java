package org.yulang.bridgePattern.impl;

import org.yulang.bridgePattern.absractPkg.Shape;
import org.yulang.bridgePattern.interfacePkg.DrawAPI;

public class Circle extends Shape {
	private int x,y ,radius;

	public Circle(int x,int y,int radius,DrawAPI draw) {
		super(draw);
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.radius=radius;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawAPI.drawCircle(radius, x, y);
	}



}
