package org.yulang.singletonPattern;
/*
 * jvm自动为enum加上多线程锁，以及序列化
 */
public enum SingletonEnum {
	INSTANCE;
	public void todoSomething() {}
}
