package com.example.designpattern.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName: com.example.designpattern.controller
 * @FileName: HelloController
 * @Description:
 * @Author: Liuh
 * @Date: 2023/1/17
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/world")
    public String HelloWorld() {
        return "hello world!";

    }
}
