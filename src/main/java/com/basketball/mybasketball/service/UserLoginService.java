package com.basketball.mybasketball.service;

import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;

public interface UserLoginService {

    /***
     * 用户登录
     * @param userLogin
     * @return
     */
    boolean loginUser(UserLogin userLogin);

    /**
     * 用户注册
     * @param userLogin
     * @return
     */
    boolean registerUserLogin(UserLogin userLogin);

    /**
     * 通过区域电话取用户信息
     * @param userPhone
     * @return
     */
    UserInfo getUserByPhone(String userPhone);

    /**
     * 修改用户信息
     *
     * @param userInfo
     * @return
     */
    boolean modifyUserInfo(UserInfo userInfo);

}
