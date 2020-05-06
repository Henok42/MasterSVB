package com.example.svb.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "svb")
@Controller
public class SvbController {

    @PostMapping(value = "/hello")
    public String getName() {
        return "Hello World ";
    }

}