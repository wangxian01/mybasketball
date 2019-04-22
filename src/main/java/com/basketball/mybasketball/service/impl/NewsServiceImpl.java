package com.basketball.mybasketball.service.impl;

import com.basketball.mybasketball.dao.NewsDao;
import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsDao newsDao;

	@Override
	public List<News> getNewsList(int newsType) {
		return newsDao.queryNews(newsType);
	}

	@Override
	public News getNewsById(int newsId) {
		return newsDao.queryNewsById(newsId);
	}
}
