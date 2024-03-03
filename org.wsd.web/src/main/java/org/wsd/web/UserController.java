package org.wsd.web;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wsd.domain.User;

import java.lang.annotation.Target;

@Tag(name = "Authentication Controller")
@RestController
public class UserController {
    @GetMapping("/")
    public User getUser() {
        return new User();
    }
}
