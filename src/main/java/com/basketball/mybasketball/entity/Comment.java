package com.basketball.mybasketball.entity;

import java.util.Date;

/**
 * Comment
 * 用户评论实体类
 * @author wangxian
 * @date 2019/4/14
 */
public class Comment {

    /**
     * 评论表id
     */
    private int id;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 新闻或视频id
     */
    private int newsId;

    /**
     * 评论内容
     */
    private String replyMsg;

    /**
     * 评论时间
     */
    private Date createDate;

    /**
     * 点赞人数
     */
    private int like;

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", newsId=" + newsId +
                ", replyMsg='" + replyMsg + '\'' +
                ", createDate=" + createDate +
                ", like=" + like +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getReplyMsg() {
        return replyMsg;
    }

    public void setReplyMsg(String replyMsg) {
        this.replyMsg = replyMsg;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
