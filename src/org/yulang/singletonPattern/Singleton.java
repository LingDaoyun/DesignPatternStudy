package org.yulang.singletonPattern;
/**
 * ����ʽ����
 * ʹ��sync�ؼ��֣���֤�̰߳�ȫ
 * ��ģʽ�ڶ��߳�����Ȼ��ȫ����Ч�ʲ�����
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
