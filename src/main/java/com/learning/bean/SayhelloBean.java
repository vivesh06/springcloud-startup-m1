package com.learning.bean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayhelloBean {

	@RequestMapping("/")
	public String say() {
		return "hello sir!";
	}
	
}
