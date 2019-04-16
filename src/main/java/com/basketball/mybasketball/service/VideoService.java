package com.basketball.mybasketball.service;

import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.entity.Video;

import java.util.List;

public interface VideoService {

    /**
     * 获取video列表
     * @return
     */
    List<Video> getVideoList();

    /**
     * 通过Id获取新闻详细信息
     * @param videoId
     * @return
     */
    Video getVideoById(int videoId);

    /**
     * 增加点赞人数
     * @param
     * @return
     */
    int updateLikes(Video video);


}
