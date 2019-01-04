package com.uwang.springmvc.day01.controller;

import com.uwang.springmvc.day01.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * springmvc 传值演示控制器
 */
@Controller
@RequestMapping("/data")
public class DataController {

    @RequestMapping("/data01")
    // public void baseData(String name1, String name2, String name3){
    public void baseData(String name) {
        System.out.println("name:" + name);
    }

    @RequestMapping("/data012")
    // @RequestParam(value = "username", required = false, defaultValue = "xiaoming"
    // value 如果不写默认为形参名，可以自定义名字
    // required 如果不写传参时必须不为空，或者使用默认值defaultValue
    // defaultValue如果没值则取默认值，有则覆盖
    public void baseData2(@RequestParam(value = "username", required = false, defaultValue = "xiaoming") String name) {
        System.out.println("name:" + name);
    }


    /**
     * 如果地址栏中{}的名字和形参名不一致，那么@PathVariable("mobile")需要指定名字
     * 如果地址栏中{}的名字和形参名一致，那么只需要 @PathVariable 即可
     *
     * @param phone
     */
    @RequestMapping("/data02/{mobile}")
    // @RequestMapping("/data02/{mobile1}/{mobile2}")
    // public void resulful(@PathVariable("mobile1") String phone, @PathVariable String mobile2){
    public void resulful(@PathVariable("mobile") String phone) {
        System.out.println("phone:" + phone);
    }

    @PostMapping("/form")
    public void form(UserEntity userEntity) {
        System.out.println(userEntity);
    }

}
