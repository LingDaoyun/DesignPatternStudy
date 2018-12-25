package org.yulang.singletonPattern;
/**
 * ����˫������double-checked locking
 * @author lsihao
 *
 */
public class SingletonDCL {
	//volatile �ؼ��ָ���jvm��Ҫʹ���߳̾���
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
