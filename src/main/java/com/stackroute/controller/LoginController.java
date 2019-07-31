package com.stackroute.controller;

import com.stackroute.model.UserLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
  @RequestMapping("/")
 public String login(){
    return "index";//view index page
}

@RequestMapping("/success")//maps the name which is present in the index.jsp
    public ModelAndView welcomeUser(){
    UserLogin userLogin=new UserLogin();
    userLogin.setName("sruthi");
    ModelAndView modelAndView=new ModelAndView("success");
    modelAndView.addObject("name",userLogin.getName());//giving the name to the attribute
    return modelAndView;
  }
}

