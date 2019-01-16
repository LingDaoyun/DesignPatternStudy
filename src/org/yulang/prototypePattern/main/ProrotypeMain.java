package org.yulang.prototypePattern.main;

import org.yulang.prototypePattern.abstractPkg.Shape;
import org.yulang.prototypePattern.util.ShapeCache;
/**
 * ԭ��ģʽ����Ҫ������Ӷ��󴴽������⣬���������Ǳ���ƣ���ֻ���Ƹö���Ļ����������ͺ����ԣ����������򲻽��и��ơ�
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
