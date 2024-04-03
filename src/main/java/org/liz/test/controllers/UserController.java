package org.liz.test.controllers;

import org.liz.test.models.User;
import org.liz.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    User getUser(@PathVariable("id") Integer id){
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    void removeUser(@PathVariable("id")Integer id){
        userService.remove(id);
    }

    void removeManyUser(@PathVariable Integer[]ids){
        Arrays.stream(ids).forEach(id -> userService.remove(id));
    }
}
