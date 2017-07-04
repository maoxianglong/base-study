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
	 * ��дequals�������ص�ԭ��
	 * �١������Ǽ򵥵ıȽϱ��������ã������о�����߼��Ƚ�
	 * �ڡ�������
	 * �ۡ��Գ���
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
