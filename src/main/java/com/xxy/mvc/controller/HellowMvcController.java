package com.xxy.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellow")
public class HellowMvcController {
	@RequestMapping("/mvc")
	public String HellowMvc() {
		Logger logger = Logger.getLogger(HellowMvcController.class); //log4j��ӡ��־
		logger.debug("intohellow");
		return "hellow";
	}
}
