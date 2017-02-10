package com.example.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 502662077 on 2/9/17.
 */
@RestController
public class MyController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
