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
        return "555555";
    }
}
