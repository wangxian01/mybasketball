package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.Comment;
import com.basketball.mybasketball.entity.Video;

/**
 * CommentDao
 * @author wangxian
 * @Description 评论
 * @date 2019/4/14
 */
public interface CommentDao {

    /**
     * 用户评论
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

    /**
     * 增加点赞人数
     * @param
     * @return
     */
    int updateLikes(Comment comment);

}
