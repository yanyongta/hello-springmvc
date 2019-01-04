package com.uwang.springmvc.day01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/")
    public ModelAndView index() {
        System.out.println("~~~~");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello", "springmvc");
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
