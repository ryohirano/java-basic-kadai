package com.example.springkadaiform.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ContactForm {
     //ユーザー名
	private String name;

	//メールアドレス
	private String email;

	//お問い合わせ内容
	private String message;

	//getter/setter
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

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
