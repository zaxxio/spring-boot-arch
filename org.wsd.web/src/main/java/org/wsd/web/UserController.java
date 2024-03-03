package org.wsd.web;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wsd.domain.UserEntity;

@Tag(name = "Authentication Controller")
@RestController
public class UserController {
    @GetMapping("/")
    public UserEntity getUser() {
        return new UserEntity();
    }
}
