package com.lius.sssenhance.user.controller;


import com.lius.sssenhance.mybatis.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lius.sssenhance.user.service.UserService;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/getuserbyid")
    public User getUser(@RequestParam(value="id", defaultValue="1") int id) {
        logger.info("getuserbyid recieved Succesfully!");
        return userService.getUserById(id);
    }

    @RequestMapping("/loginByUserIdAndPasswd")
    public Boolean loginByUserId(@RequestParam(value="id", defaultValue="1") int id,
                                 @RequestParam(value="passwd") String passwd    ) {
        logger.info("loginByUserId recieved Succesfully!");
        return userService.loginByUserIdAndPasswd(id,passwd);
    }
}
