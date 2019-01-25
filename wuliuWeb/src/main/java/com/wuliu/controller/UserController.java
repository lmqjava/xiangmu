package com.wuliu.controller;

import com.wuliu.pojo.User;
import com.wuliu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/selectAll")
    public List<User> selectAll(){
        return iUserService.selectAll();
    }
}
