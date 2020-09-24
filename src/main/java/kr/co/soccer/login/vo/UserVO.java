package kr.co.soccer.login.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

// VO 생성시 Serializable 구현하는게 원칙
public class UserVO implements Serializable {
	private String userId;
	private String userName;
	private String userPass;
	private String userRole;

	// 생성자
	public UserVO() {
	}

	// 생성자
	public UserVO(String userId, String userName, String userPass, String userRole) {
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.userRole = userRole;
	}

	// toString() 구현
	// 맴버필드의 get/set 메서드 생성
	// toString 편하게 해주는 ToStringBuilder로 변경
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}  

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}