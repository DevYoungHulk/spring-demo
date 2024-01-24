package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("test")
    public String test() {

        return "success";
    }

    @GetMapping("null")
    public String NullError() {
        String NULL = null;
        return NULL.toString();
    }
}
