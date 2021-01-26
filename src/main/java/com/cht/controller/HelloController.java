package com.cht.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String info() {
        return "hello world";
    }
    @RequestMapping("info1")
    public String info1() {
        return "9999";
    }
    @RequestMapping("info2")
    public String info2() {
        return "22222";
    }
    @RequestMapping("info3")
    public String info3() {
        return "333336";
    }
    @RequestMapping("info4")
    public String info4() {
        return "info4";
    }
}
