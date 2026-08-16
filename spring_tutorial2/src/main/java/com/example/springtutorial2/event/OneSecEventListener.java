package com.example.springtutorial2.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class OneSecEventListener{
	//秒数カウント
	private int count;
	
	//イベントの発行を受けてカウントを進める
	@EventListener
	private void onOneSecEvent(OneSecEvent event) {
		this.count++;//
	}
}