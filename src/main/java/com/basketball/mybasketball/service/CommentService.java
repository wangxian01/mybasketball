package com.basketball.mybasketball.service;

import com.basketball.mybasketball.entity.Comment;
import com.basketball.mybasketball.entity.News;

import java.util.List;

public interface CommentService {

    /**
     * 获取评论列表
     * @return listComments
     */
    List<Comment> getCommentList(int newsId);

    /**
     * 对新闻进行评论
     * @param
     * @return
     */
    boolean insertComment(Comment comment);

}
