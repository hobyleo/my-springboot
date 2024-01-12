package com.hoby.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hoby.user.service.UserService;

/**
 * @author hoby
 * @since 2024-01-12
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return userService.test();
    }

}
