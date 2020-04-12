package com.coronatest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication(scanBasePackages = "com.coronatest")
public class CoronaTestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTestDemoApplication.class, args);
	}
	
	
	
	/*@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		// ResourceBundleViewResolver viewResolve = new ResourceBundleViewResolver();
		viewResolve.setPrefix("/WEB-INF/views/");
		viewResolve.setSuffix(".jsp");
		viewResolve.setViewClass(JstlView.class);
		System.out.println("i was here bruhhhhh in view resolver......");
		return viewResolve;
	}*/

}
