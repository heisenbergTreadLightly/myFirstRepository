package com.coronatest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home() {

		System.out.println("i was here bruhhhhh 678900......");

		return "welcome";
	}
}