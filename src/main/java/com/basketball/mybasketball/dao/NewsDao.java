package com.basketball.mybasketball.dao;

import com.basketball.mybasketball.entity.News;

import java.util.List;

public interface NewsDao {

    /**
     * 列出新闻列表列表
     * @return newsList
     */
    List<News> queryNews();

    /**
     * 根据Id列出具体新闻详情
     * @return news
     */
    News queryNewsById(int newsId);
}
