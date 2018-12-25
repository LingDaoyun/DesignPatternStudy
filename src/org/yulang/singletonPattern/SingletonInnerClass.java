package org.yulang.singletonPattern;
/**
 * 采用内部类的方式，实现延迟加载
 * 由于classloader机制，同样是多线程安全
 * @author lsihao
 *
 */
public class SingletonInnerClass {
	private static class SingletonHolder{
		private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
	}
	private SingletonInnerClass() {}
	public static final SingletonInnerClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
