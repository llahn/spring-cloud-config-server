package com.llahn.config.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RefreshScope
public class LuckyWord2Controller {
	
//	@Value("${wordConfig.luckyWord}")
//	String luckyWord;
//
//	@RequestMapping("/lucky-word")
//	public String showLuckyWord() {
//		return "The lucky word is: " + luckyWord;
//	}
}
