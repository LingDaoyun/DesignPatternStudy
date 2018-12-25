package org.yulang.singletonPattern;
/**
 * �����ڲ���ķ�ʽ��ʵ���ӳټ���
 * ����classloader���ƣ�ͬ���Ƕ��̰߳�ȫ
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
