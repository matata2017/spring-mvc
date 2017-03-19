package com.xxy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Index")
public class IndexController {
	@RequestMapping("/mvc")
	public String HellowMvc() {
		return "index";
	}
}
