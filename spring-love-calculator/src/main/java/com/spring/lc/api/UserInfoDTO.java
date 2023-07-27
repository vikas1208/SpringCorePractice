package com.spring.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "UserName can't be blank")
	@Size(min=3,max=15,message = "Your name should have atleast 3 characters...")
	private String userName="Mr xx";
	private String crushName="Miss yy";
	@AssertTrue(message = "You ahve to agree the term and Condition")
	private boolean termCondition;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean getTermCondition() {
		return termCondition;
	}
	public void setTermCondition(boolean termCondition) {
		this.termCondition = termCondition;
	}
	
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
	
	
}
