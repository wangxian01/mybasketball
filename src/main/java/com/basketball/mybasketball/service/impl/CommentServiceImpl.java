package com.basketball.mybasketball.service.impl;

import com.basketball.mybasketball.dao.CommentDao;
import com.basketball.mybasketball.dao.UserLoginDao;
import com.basketball.mybasketball.entity.Comment;
import com.basketball.mybasketball.entity.UserInfo;
import com.basketball.mybasketball.entity.UserLogin;
import com.basketball.mybasketball.service.CommentService;
import com.basketball.mybasketball.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * 获取评论
     * @param newsId
     * @return
     */
    @Override
    @Transactional
    public List<Comment> getCommentList(int newsId) {
        return commentDao.queryComments(newsId);
    }

    /**
     * 发布评论
     * @param comment
     * @return
     */
    @Override
    public boolean insertComment(Comment comment) {
            try {
                int effectedNum = commentDao.insertComment(comment);
                if (effectedNum > 0){
                    return true;
                }else {
                    throw new RuntimeException("评论失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("评论失败:" + e.getMessage());
            }
    }
}
