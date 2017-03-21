package com.xxy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("load")
public class CakeController {
	@RequestMapping("file")
	private String upload() {
		return "load";
	}
}
