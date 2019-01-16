package org.yulang.prototypePattern.abstractPkg;

public abstract class Shape implements Cloneable {
	private String id ;
	protected String type;
	public abstract void draw();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public Object clone()  {
		// TODO Auto-generated method stub
		Object  object = null;
		try {
			System.out.println("clone 方法被调用");
			object =  super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
