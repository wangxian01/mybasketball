package com.basketball.mybasketball.service;

import com.basketball.mybasketball.entity.UserLogin;

public interface UserLoginService {

    /**
     * 用户注册
     * @param userLogin
     * @return
     */
    boolean registerUserLogin(UserLogin userLogin);

}
