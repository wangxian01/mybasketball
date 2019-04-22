package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.Comment;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * CommentDaoTest
 *
 * @author wangxian
 * @Description
 * @date 2019/4/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 按方法名大小升序执行
public class CommentDaoTest {


    //通过spring容器注入Dao的实现类
    @Autowired
    private CommentDao commentDao;

    @Test
    public void queryComments() {

        List<Comment> commentList = commentDao.queryComments(1);
        for (int i = 0; i < commentList.size(); i++) {
            System.err.println(commentList.get(i).toString());
        }
    }

    @Test
    public void insertComment() {
        Comment comment = new Comment();
        comment.setNewsId(1);
        comment.setUserId(6);
        comment.setReplyMsg("你打篮球像cxk");
        comment.setCreateDate(new Date());
        comment.setLikes(0);
        int i = commentDao.insertComment(comment);

    }
}