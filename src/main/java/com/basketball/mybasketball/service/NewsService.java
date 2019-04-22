package com.basketball.mybasketball.service;

import com.basketball.mybasketball.entity.News;

import java.util.List;

public interface NewsService {

    /**
     * 获取新闻列表
     * @return listNews
     */
    List<News> getNewsList(int newsType);

    /**
     * 通过Id获取新闻详细信息
     * @param newsId
     * @return News
     */
    News getNewsById(int newsId);

}
