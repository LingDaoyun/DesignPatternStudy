package org.yulang.builderPattern.abstractPkg;

import org.yulang.builderPattern.impl.Wrapper;
import org.yulang.builderPattern.interfacePackage.Item;
import org.yulang.builderPattern.interfacePackage.Packing;

public abstract class Burger implements Item {
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
}
