package com.stackroute.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration//It specifies that the class has @Bean so the spring container can process the class and generate the bean
@EnableWebMvc//It is used for enabling web mvc
@ComponentScan(basePackages = "com.stackroute")//It is used for reading all the packages present in the base package and to read the controller
public class LoginConfig {
    @Bean
    public ViewResolver viewResolver() { //viewResolver is which enable you to render models in the browser without tying the implementation to a specific view technology.
      InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();//The InternalResourceViewResolver is an implementation of ViewResolver in Spring MVC framework which resolves logical view name

      viewResolver.setPrefix("/WEB-INF/views/");//It is used to specify where the jsp pages are present
      viewResolver.setSuffix(".jsp");//it gives the jsp pages

      return viewResolver;
    }
  }


