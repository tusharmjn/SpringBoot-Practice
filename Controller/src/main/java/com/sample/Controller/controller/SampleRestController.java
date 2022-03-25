package com.sample.Controller.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Controller.model.User;

//@Controller
@RestController
public class SampleRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/user")

//    @ResponseBody
    public ResponseEntity<User> getUser() {

        User user = new User();
        user.setName("RANDOM");
        user.setAge(2);
        user.setCity("JAMMU");
        user.setCountry("India");

        return ResponseEntity.ok(user);
    }

}
