package com.mxl.utils;

import java.util.Date;

public class SourceData {

	private String name;
	private String email;
//	private Date createDate;
	private String createDate;
	
	public SourceData(){};
	
	public SourceData(String name , String email , String createDate) {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "SourceData [name=" + name + ", email=" + email
				+ ", createDate=" + createDate + "]";
	}
}
