package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.entity.Video;

import java.util.List;

/**
 * VideoDao
 * @author wangxian
 * @date 2019/4/14
 */
public interface VideoDao {

    /**
     * 列出视频列表
     * @return videosList
     */
    List<Video> queryVideos();

    /**
     * 根据Id列出具体视频详情
     * @return video
     */
    Video queryVideoById(int videoId);

    /**
     * 增加点赞人数
     * @param
     * @return
     */
    int updateLikes(Video video);

}
