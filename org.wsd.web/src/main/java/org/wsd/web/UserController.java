package org.wsd.application.controller;


import org.springframework.web.bind.annotation.RestController;
import org.wsd.application.User;

@RestController
public class UserController {
    public User getUser() {
        return new User();
    }
}
