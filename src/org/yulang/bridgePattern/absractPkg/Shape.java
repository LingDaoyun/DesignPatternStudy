package org.yulang.bridgePattern.absractPkg;

import org.yulang.bridgePattern.interfacePkg.DrawAPI;

public abstract class Shape {

	protected  DrawAPI drawAPI ;
	
	protected Shape(DrawAPI draw) {
	   this.drawAPI =draw;	
	}

	public abstract void draw();

}