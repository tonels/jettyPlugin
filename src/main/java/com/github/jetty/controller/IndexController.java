package com.github.jetty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index() {
        log.error("error");
        log.info("info");
        log.debug("debug");
        return "index";
    }

    @GetMapping("/err")
    public void error() {
        Integer a = 0;
        int b= 1;
        final int i = b / a;

    }

}
