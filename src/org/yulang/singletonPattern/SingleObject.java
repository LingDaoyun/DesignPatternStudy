package org.yulang.singletonPattern;
/**
 * 饿汉单例模式
 * 不是lazy加载模式
 * @author lsihao
 *
 */
public class SingleObject {
	private static SingleObject INSTANCE  = new SingleObject();
	//私有化构造函数，使其不能被外部调用
	private SingleObject() {}
	public static SingleObject getInstance() {
		return INSTANCE;
	}
}
