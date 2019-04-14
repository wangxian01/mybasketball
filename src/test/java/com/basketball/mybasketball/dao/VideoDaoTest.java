package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.Video;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * VideoDaoTest
 *
 * @author wangxian
 * @Description
 * @date 2019/4/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class VideoDaoTest {

    //通过spring容器注入Dao的实现类
    @Autowired
    private VideoDao videoDao;

    @Test
    public void queryVideos() {

        List<Video> videoList = videoDao.queryVideos();
        for (int i = 0; i < videoList.size(); i++) {
            System.err.println(videoList.get(i).toString());
        }
    }

    @Test
    public void queryVideoById() {

        Video video = videoDao.queryVideoById(2);
        System.err.println(video.toString());

    }

    @Test
    public void updateLikes() {
        Video video = new Video();
        video.setLike("200");
        video.setId(2);
        int i = videoDao.updateLikes(video);
    }
}