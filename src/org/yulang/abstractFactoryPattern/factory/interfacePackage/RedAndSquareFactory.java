package org.yulang.abstractFactoryPattern.factory.interfacePackage;

import org.yulang.abstractFactoryPattern.factory.ColorFactory;
import org.yulang.abstractFactoryPattern.factory.ShapeFactory;
import org.yulang.abstractFactoryPattern.interfacePackage.Color;
import org.yulang.factoryPattern.interfacePackage.Shape;

/**
 * ��Ʒ��ģʽ��������ѡ��һ��ͼ��ʱ����ͬ����һ�׵Ķ����������ɫ��������
 * @author lsihao
 *
 */
public class RedAndSquareFactory implements AbstractFactory{

	@Override
	public Shape createShape() {
		// TODO Auto-generated method stub
		return ShapeFactory.getShape(Shape.SQUARE);
	}

	@Override
	public Color createColor() {
		// TODO Auto-generated method stub
		return ColorFactory.getColor(Color.RED);
	}

}
