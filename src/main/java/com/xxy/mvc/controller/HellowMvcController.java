package com.xxy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellow")
public class HellowMvcController {
	@RequestMapping("/mvc")
	public String HellowMvc() {
		return "hellow";
	}
}
