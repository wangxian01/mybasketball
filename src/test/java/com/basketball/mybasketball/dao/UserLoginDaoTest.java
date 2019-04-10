package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class UserLoginDaoTest {

    //通过spring容器注入Dao的实现类
    @Autowired
    private UserLoginDao userLoginDao;

    @Test
    @Ignore
    public void insertUser() {

        UserLogin userLogin = new UserLogin();
        userLogin.setUserPhone("17608029745");
        userLogin.setPassword("123456");
        int insertUser = userLoginDao.insertUser(userLogin);

    }

    @Test
    public void updateUserInfo() {

        UserInfo userInfo = new UserInfo();
        userInfo.setName("小李子");
        userInfo.setArea("北京");
//        userInfo.setBirthday(new Date());
        userInfo.setGender("0");
        userInfo.setIntroduction("我喜欢打兵兵球");
        userInfo.setPhone("17608029745");
        int update = userLoginDao.updateUserInfo(userInfo);

    }
}