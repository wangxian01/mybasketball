package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.News;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class NewsDaoTest {

    //通过spring容器注入Dao的实现类
    @Autowired
    private NewsDao newsDao;

    @Test
    @Ignore
    public void queryNews() {

        List<News> newsList = newsDao.queryNews();
        System.err.println(newsList.get(0).toString());
        // 验证预期值和实际值是否相符
        assertEquals(1, newsList.size());

    }

    @Test
    public void queryNewsById() {

        News news = newsDao.queryNewsById(1);
        assertEquals("测试一下咯",news.getTitle());

    }
}