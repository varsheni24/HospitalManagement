package com.example.HospitalManagement.Controller;


import com.example.HospitalManagement.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(@RequestParam String userName, @RequestParam String password) {
        return userService.getRoleByUserNameAndPassword(userName, password);
    }
}
