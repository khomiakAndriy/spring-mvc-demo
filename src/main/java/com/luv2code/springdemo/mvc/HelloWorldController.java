package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldConyroller {

    // need a controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showForn(){
        return "helloworld-form";
    }

    // need a controller method to process HTML form
    @RequestMapping("/processForm")
    public String processForn(){
        return "hello";
    }

}
