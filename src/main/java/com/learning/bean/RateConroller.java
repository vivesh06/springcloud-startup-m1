package com.learning.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RefreshScope
public class RateConroller {

	@Value("${rate}")
	String rate;

	@Value("${lanecount}")
	String laneCount;
	
	@Value("${tollstart}")
	String tollStart;
	
	@Value("${connstring}")
	String connstring;
	
	@RequestMapping("/rate")
	public String getRates(Model m) {
		m.addAttribute("rate", rate);
		m.addAttribute("laneCount", laneCount);
		m.addAttribute("tollStart", tollStart);
		m.addAttribute("connstring", connstring);
		return "rateView";
	}
	
}
