package com.uwang.springmvc.day01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebController {

    @RequestMapping("/test1")
    public String test1() {
        // 转发
        return "user";
    }


    @RequestMapping("/test2")
    public String test2(HttpServletRequest request, HttpServletResponse response) {
        // 重定向：response.sendRedirect("/web/test1");
        return "redirect:/web/test1";
    }

    @RequestMapping("/test3")
    public String test3(HttpSession session) {
        // 设置session时间
        session.setMaxInactiveInterval(24 * 60); // s
        // 其他操作和以前一样，直接得到httpSession 对象
        return "";
    }
}
