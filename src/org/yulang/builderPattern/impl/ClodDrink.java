package org.yulang.builderPattern.impl;

import org.yulang.builderPattern.interfacePackage.Item;
import org.yulang.builderPattern.interfacePackage.Packing;

public abstract class ClodDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
