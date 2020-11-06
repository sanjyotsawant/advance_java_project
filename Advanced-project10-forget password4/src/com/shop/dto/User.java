package com.shop.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	@Column(name="u_id")
	private int id;
	
	@Column(name="u_name")
	@NotBlank(message = "Username can not be blabk")
	@Email(message="Invalid Email....Please enter valid emailsss")
	private String userName;
	
	@Column(name="u_pass")
	@NotBlank(message = "Password can not be blabk")
	@Size(max = 20, min = 3, message = "enter valid password")

	private String userPass;
	
	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	
}
