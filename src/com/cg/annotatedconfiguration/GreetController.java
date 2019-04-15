package com.cg.annotatedconfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public ModelAndView greet() {
		System.out.println("in controller");

		return new ModelAndView("home", "msg", "java config spring mvc");
	}
}
