package com.example.springkadaiform.form;

import lombok.Data;

@Data
public class ContactForm {
     //ユーザー名
	private String userName;

	//メールアドレス
	private String email;

	//お問い合わせ内容
	private String message;
}
