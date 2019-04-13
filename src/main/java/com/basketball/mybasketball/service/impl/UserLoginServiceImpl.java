package com.basketball.mybasketball.service.impl;

import com.basketball.mybasketball.dao.UserLoginDao;
import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;
import com.basketball.mybasketball.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginDao userLoginDao;

    /**
     * 注册账号
     * @param userLogin
     * @return
     */
    @Transactional
    @Override
    public boolean registerUserLogin(UserLogin userLogin) {
        if(userLogin.getUserPhone() != null && userLogin.getPassword() != null){
            try {
                int effectedNum = userLoginDao.insertUser(userLogin);
                if (effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("注册失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("注册失败:" + e.getMessage());
            }
        }else {
            throw new RuntimeException("账号和密码不能为空！");
        }
    }


    /**
     * 根据用户信息显示用户数据
     * @param userPhone
     * @return
     */
    @Override
    public UserInfo getUserByPhone(String userPhone) {
        return userLoginDao.queryUserInfoByPhone(userPhone);
    }

    /**
     * 修改用户信息
     * @param userInfo
     * @return
     */
    @Transactional
    @Override
    public boolean modifyUserInfo(UserInfo userInfo) {
        // 空值判断
        if (userInfo.getPhone() != null && !"".equals(userInfo.getPhone())) {
            try {
                // 更新用户信息
                int effectedNum = userLoginDao.updateUserInfo(userInfo);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新用户信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新用户信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("phone不能为空！");
        }
    }

}
