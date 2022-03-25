package com.sample.Controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @RequestMapping(method = RequestMethod.GET, value = "/web")
    public String loadIndexPage() {
        System.out.println("Loading Index Page");
        return "This is index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    @ResponseBody
    public String userData() {
        return "Somedata";
    }
}
