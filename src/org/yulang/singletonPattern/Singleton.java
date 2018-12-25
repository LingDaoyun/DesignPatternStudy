package org.yulang.singletonPattern;
/**
 * 懒汉式单例
 * 使用sync关键字，保证线程安全
 * 该模式在多线程下虽然安全，但效率并不高
 * @author lsihao
 *
 */
public class Singleton {
	private static Singleton INSTANCE = null;
	private Singleton() {}
	public synchronized static Singleton getInstance() {
		if(null == INSTANCE) {
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
}
