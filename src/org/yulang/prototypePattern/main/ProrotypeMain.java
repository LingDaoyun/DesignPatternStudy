package org.yulang.prototypePattern.main;

import org.yulang.prototypePattern.abstractPkg.Shape;
import org.yulang.prototypePattern.util.ShapeCache;
/**
 * 原型模式，主要解决复杂对象创建的问题，这里采用了潜复制，即只复制该对象的基本数据类型和属性，引用类型则不进行复制。
 * @author lsihao
 *
 */
public class ProrotypeMain {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape cloneShape1 = ShapeCache.getShape("1");
		cloneShape1.draw();
		Shape cloneShape2 = ShapeCache.getShape("2");
		cloneShape2.draw();
		Shape cloneShape3 = ShapeCache.getShape("3");
		cloneShape3.draw();
	}
}
