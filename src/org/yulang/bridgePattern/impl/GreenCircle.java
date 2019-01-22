package org.yulang.bridgePattern.impl;

import org.yulang.bridgePattern.interfacePkg.DrawAPI;

public class GreenCircle implements DrawAPI{

	@Override
	public void drawCircle(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle [color : green , redius :  "+radius+",X:"+x+"Y:"+y+"]");
	}

}
