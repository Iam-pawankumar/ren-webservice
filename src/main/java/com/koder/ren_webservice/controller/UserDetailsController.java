package com.koder.ren_webservice.controller;

import com.koder.ren_webservice.model.User;
import com.koder.ren_webservice.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping(value="/getUser")
    public Optional<User> getUser() {
        return userDetailsService.findUserById("john.doe@example.com");
    }
}
