package com.example.JdbcConn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import  org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.GetMapping;
import  org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.ResponseBody;

import com.example.JdbcConn.User;
import com.example.JdbcConn.UserRepository;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    UserRepository userRepository;
    @GetMapping(path = "/add")
    public @ResponseBody String addNewUser (@RequestParam String name)
    {
        User n=new User();
        n.setName(name);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers()
    {
        return userRepository.findAll();
    }
}
