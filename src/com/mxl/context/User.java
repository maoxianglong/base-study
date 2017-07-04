package com.mxl.context;

public class User {

	private String userName;
	private int age;
	
	public User(){}
	
	public User(String userName , int age){
		this.userName = userName;
		this.age = age;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 重写equals方法遵守的原则
	 * ①、对象不是简单的比较变量的引用，而是有具体的逻辑比较
	 * ②、传递性
	 * ③、对称性
	 */
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User)) 
			return false;
		if (((User)obj).userName.equals(this.userName) && ((User)obj).age == (this.age)) {
			return true;
		}
		return false;
	}
}
