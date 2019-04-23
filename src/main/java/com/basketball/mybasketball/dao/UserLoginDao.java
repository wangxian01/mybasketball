package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;

public interface UserLoginDao {

    /**
     * 用户登录
     * @param userLogin
     * @return
     */
    UserLogin loginUser(UserLogin userLogin);

    /**
     * 用户注册
     * @param userLogin
     * @return
     */
    int insertUser(UserLogin userLogin);

    /**
     * 根据手机号列出用户信息
     * @return userInfo
     */
    UserInfo queryUserInfoByPhone(String userPhone);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);

    /**
     * 修改用户头像
     * @param userInfo
     * @return
     */
    int updateUserImage(UserInfo userInfo);
}
