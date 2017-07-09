package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showForn(){
        return "helloworld-form";
    }

    // need a controller method to process HTML form
    @RequestMapping("/processForm")
    public String processForn(){
        return "helloworld";
    }

    // new controller method to read form data and
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model){
        // read request parameter from HTML form
        String theName = request.getParameter("studentName");

        // convert the data to all caps
        theName = theName.toUpperCase();

        // create message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("messega", result);

        return "helloworld";
    }

}
