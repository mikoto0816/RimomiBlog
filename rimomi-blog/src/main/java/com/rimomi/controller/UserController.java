package com.rimomi.controller;

import com.rimomi.anotation.SysLog;
import com.rimomi.domain.ResponseResult;
import com.rimomi.domain.entity.User;
import com.rimomi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userInfo")
    @SysLog(businessName = "更新用户信息")
    public ResponseResult userInfo(){
        return userService.userInfo();
    }

    @PutMapping("/updateUserInfo")
    public ResponseResult updateUserInfo(@RequestBody User user){
        return userService.updateUserInfo(user);
    }
    @PostMapping("/register")
    public ResponseResult register(@RequestBody User user){
        return userService.register(user);
    }
}
