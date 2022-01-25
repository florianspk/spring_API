package com.estiam.Estiam_SpringJava.controller;

import com.estiam.Estiam_SpringJava.model.User.User;
import com.estiam.Estiam_SpringJava.model.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserDao userDao;
    @Autowired
    public UserController(final UserDao userDao){
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public List<User> userList(){
        return userDao.findAll();
    }

    @PostMapping("/addUser")
    public boolean addUser(@RequestBody User user){
        System.out.println(user.getFirstName());
        return true;
    }

}
