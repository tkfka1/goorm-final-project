package com.finalproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    // 자바스크립트 json-> api
    // SPA vue + SSR  = nuxt 방식

    @GetMapping("/posts")
    public String get() {
        System.out.println("Hello world");
        return "Hello World";

    }

}
