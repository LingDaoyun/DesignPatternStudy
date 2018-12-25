package org.yulang.singletonPattern;
/**
 * 采用双检锁，double-checked locking
 * @author lsihao
 *
 */
public class SingletonDCL {
	//volatile 关键字告诉jvm不要使用线程镜像
	private volatile static SingletonDCL INSTANCE;
	private SingletonDCL() {}
	public static SingletonDCL getInstance() {
		if(null == INSTANCE) {
			synchronized (SingletonDCL.class) {
				if(null == INSTANCE) {
					INSTANCE = new SingletonDCL();
				}
			}
		}
		return INSTANCE;
	}
}
