package com.coronatest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

	
	@RequestMapping("/")
    public String home() {
		
		System.out.println("i was here bruhhhhh......");
       
        return  "welcome";
    }
}