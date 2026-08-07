package com.example.springkadaiform.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
			RedirectAttributes redirectAttributes) {

		 // バリデーション NG → /form にリダイレクト
	    if (bindingResult.hasErrors()) {

	        // 入力値を保持したままフォームに戻す
	        redirectAttributes.addFlashAttribute("contactForm", contactForm);

	        // エラー情報をフォームに渡す
	        redirectAttributes.addFlashAttribute(
	                "org.springframework.validation.BindingResult.contactForm",
	                bindingResult);

	        return "redirect:/form";
	    }
		//バリデーションOK　→　確認画面へ
		return "confirmView";
	}

}
