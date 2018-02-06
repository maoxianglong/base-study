package com.mxl.utils;

import java.util.Date;

public class TargetData {

	private String name;
	private String email;
	private Date createDate;
	
	public TargetData(){};
	
	public TargetData(String name , String email , Date createDate) {
		this.name = name;
		this.email = email;
		this.createDate = createDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "TargetData [name=" + name + ", email=" + email
				+ ", createDate=" + createDate + "]";
	}
	
}
