package com.jenkins.DemoApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getEmployee")
    public String get() {
        return "hello employees";

    }
}
