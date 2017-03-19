package com.xxy.mvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xxy.mvc.entity.Cours;
import com.xxy.mvc.service.CourseService;

@Controller
@RequestMapping("/Course")
public class CoursController {
	private static Logger logger = Logger.getLogger(CoursController.class); //log4j打印日志
	private CourseService  CourseService;
	@Autowired
	public void setCourseService(CourseService courseService) {
		CourseService = courseService;
	}
	//@RequestMapping(value="/view",method=RequestMethod.GET ) 表示只处理 GET方法的
	// url=/Course/view?CoursId=123
	@RequestMapping(value="/view",method=RequestMethod.GET )
	public String ViewCourse(@RequestParam("CoursId")Integer CoursId,Model model ){
		Cours cours =CourseService.getCoursById(CoursId);
		logger.debug("CoursId is "+ CoursId);
		model.addAttribute(cours);
		return "CourseView";
	}
}
