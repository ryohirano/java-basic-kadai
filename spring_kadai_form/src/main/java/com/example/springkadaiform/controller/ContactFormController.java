package com.example.springkadaiform.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springkadaiform.form.ContactForm;
import jakarta.validation.Valid;

@Controller
public class ContactFormController {
	//フォーム画面の表示
	@GetMapping("/form")
     public String showForm(Model model) {

	//すでに上書きが存在する場合は上書きしない
		if(!model.containsAttribute("contactForm")) {
			model.addAttribute("contactForm", new ContactForm());
		}

		return "contactFormView";
}
	//確認画面の表示
	@PostMapping("/confirm")
	public String confirm(
			@Valid ContactForm contactForm,
			BindingResult bindingResult,
			Model model) {

		//バリデーションNG　→　フォームへ戻す
		if(bindingResult.hasErrors()) {
			model.addAttribute("contactForm", contactForm);
			return "contactFormView";
		}
		//バリデーションOK　→　確認画面へ
		model.addAttribute("contactForm", contactForm);
		return "confirmView";
	}

}
