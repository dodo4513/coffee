package com.toss.coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cyclamen on 3/4/20
 */

@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }

}
