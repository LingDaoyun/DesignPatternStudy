package org.yulang.singletonPattern;
/**
 * ��������ģʽ
 * ����lazy����ģʽ
 * @author lsihao
 *
 */
public class SingleObject {
	private static SingleObject INSTANCE  = new SingleObject();
	//˽�л����캯����ʹ�䲻�ܱ��ⲿ����
	private SingleObject() {}
	public static SingleObject getInstance() {
		return INSTANCE;
	}
}
