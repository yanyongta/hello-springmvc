package com.uwang.springmvc.day01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 演示请求方式的控制器
 */
@Controller
@RequestMapping("/view")
public class RequestController {

    /**
     * localhost:8081/view
     * <p>
     * 只接受get请求
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "";
    }

    /**
     * localhost:8081/view/get
     * <p>
     * 只接受get请求
     *
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String get() {
        System.out.println("get~~~");
        return "";
    }

    @GetMapping("/onlyGet")
    public String onlyGet() {
        System.out.println("onlyGet~~~");
        return "";
    }

    /**
     * 可以处理:
     * localhost:8081/view/get1
     * localhost:8081/view/get2
     * 请求
     *
     * @return
     */
    @RequestMapping(value = {"/get1", "/get2"}, method = RequestMethod.GET)
    public String moreGet() {
        System.out.println("moreGet~~");
        return "";
    }

    /**
     * localhost:8081/view/post
     * <p>
     * 只接受post请求
     *
     * @return
     */
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String post() {
        System.out.println("post~~");
        return "";
    }

    @PostMapping("/onlyPost")
    public String onlyPost() {
        System.out.println("onlyPost~~");
        return "";
    }
}
