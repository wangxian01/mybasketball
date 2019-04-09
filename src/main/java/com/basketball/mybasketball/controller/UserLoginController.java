package com.basketball.mybasketball.controller;

import com.basketball.mybasketball.entity.UserLogin;
import com.basketball.mybasketball.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/userlogin")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    private Map<String,Object> register(@RequestBody UserLogin userLogin){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 用户注册
        modelMap.put("success", userLoginService.registerUserLogin(userLogin));
        return modelMap;
    }

}
