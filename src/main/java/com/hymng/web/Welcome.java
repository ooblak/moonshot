package com.hymng.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ooblak
 * @Date: 2020-04-15 19:18
 */
@RestController
public class Welcome {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
