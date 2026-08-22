package com.example.springtutorial2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springtutorial2.event.OneSecEventListener;

@Controller
public class EventController{
	private final OneSecEventListener eventListener;

	public EventController(OneSecEventListener eventListener) {
		//イベントリスナークラスの依存性を注入
		this.eventListener = eventListener;
	}
	@GetMapping("/event")
	public String event(Model model) {
		//イベントリスナークラスの数秒カウントをビューに渡す
		int count = eventListener.getCount();
		model.addAttribute("count" , count);

		return "eventView";
	}
}