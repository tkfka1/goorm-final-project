package com.finalproject.controller;


import com.finalproject.request.ApiCreate;
import com.finalproject.service.GotoDBService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ApiController {

    // Http Method
    // Get, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT

    // GET
    @GetMapping("/get")
    public String get() {
        System.out.println("Hello world GET 요청!");
        return "Hello World";

    }

    private final GotoDBService gotoDBService;

    // POST
    @PostMapping("/post")
    public void post(@RequestBody @Valid ApiCreate request){
        // db.save(params)
        gotoDBService.goDB(request);
    }

}
