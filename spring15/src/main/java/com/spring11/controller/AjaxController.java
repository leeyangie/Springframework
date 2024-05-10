package com.spring11.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring11.service.SampleService;

public class AjaxController {

	private static final Logger log =
			LoggerFactory.getLogger(AjaxController.class);
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String ajaxHome() {
		return "ajax/home";
	}
	
	@GetMapping("/ajax1.do")
	public String ajaxTest1() { return "ajax/ajax1";}
	
	
	@PostMapping("/ajax1pro.do")
	public String ajaxTest2Pro() {
		String str = "POST 전송 테스트";
		log.info(str);
		return "ajax/ajax1";
	}
	
	@GetMapping("/ajax3.do")
	public String ajaxTest3() {
		return "ajax/ajax3";
	}
	
	@PostMapping("/ajax3pro.do")
	public String ajaxTest3Pro(@RequestParam("msg") String msg) {
		log.info(msg);
		return "ajax/ajax3";
	}
}
