package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;

public interface UserLoginDao {

    /**
     * 用户注册
     * @param userLogin
     * @return
     */
    int insertUser(UserLogin userLogin);

    /**
     * 根据手机号列出用户信息
     * @return area
     */
    UserInfo queryUserInfoByPhone(int userPhone);

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo);
}
