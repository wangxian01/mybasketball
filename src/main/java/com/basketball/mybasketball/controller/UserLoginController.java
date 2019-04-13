package com.basketball.mybasketball.controller;

import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;
import com.basketball.mybasketball.service.UserLoginService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
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

    /**
     * 通过用户手机号获取用户信息
     *
     * @return
     */
    @RequestMapping(value = "/getuserbyphone", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(String userPhone) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        UserInfo userInfo = userLoginService.getUserByPhone(userPhone);
        modelMap.put("userInfo", userInfo);
        return modelMap;
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @param
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    @RequestMapping(value = "/modifyuserinfo", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody UserInfo userInfo)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", userLoginService.modifyUserInfo(userInfo));
        return modelMap;
    }



}
