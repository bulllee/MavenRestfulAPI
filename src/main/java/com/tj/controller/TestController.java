package com.tj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value="/index")
	public ModelAndView index()
	{
		return new ModelAndView("show");
	}
}
