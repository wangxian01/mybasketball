package com.basketball.mybasketball.service.impl;

import com.basketball.mybasketball.dao.UserLoginDao;
import com.basketball.mybasketball.entity.UserLogin;
import com.basketball.mybasketball.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
