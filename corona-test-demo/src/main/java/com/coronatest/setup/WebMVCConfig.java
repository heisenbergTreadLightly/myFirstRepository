package com.coronatest.setup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
//@ComponentScan(basePackages="com.coronatest.controllers")

public class WebMVCConfig extends WebMvcConfigurationSupport {
	
	

	/**
	 * Configure view resolver.
	 *
	 * @return the view resolver
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
		// ResourceBundleViewResolver viewResolve = new ResourceBundleViewResolver();
		viewResolve.setPrefix("/WEB-INF/views/");
		viewResolve.setSuffix(".jsp");
		viewResolve.setViewClass(JstlView.class);
		System.out.println("i was here bruhhhhh in view resolver 78907654......");
		return viewResolve;
	}
	
	
	
}
