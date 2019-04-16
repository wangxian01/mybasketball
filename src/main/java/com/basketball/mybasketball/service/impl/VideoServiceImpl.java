package com.basketball.mybasketball.service.impl;

import com.basketball.mybasketball.dao.NewsDao;
import com.basketball.mybasketball.dao.VideoDao;
import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.entity.Video;
import com.basketball.mybasketball.service.NewsService;
import com.basketball.mybasketball.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDao videoDao;

	@Override
	public List<Video> getVideoList() {
		return videoDao.queryVideos();
	}

	@Override
	public Video getVideoById(int videoId) {
		return videoDao.queryVideoById(videoId);
	}

	/**
	 * 增加点赞人数
	 * @param
	 * @return
	 */
	@Transactional
	public int updateLikes(Video video) {
		try {
			// 更新用户信息
			int effectedNum = videoDao.updateLikes(video);
			if (effectedNum > 0) {
				return Integer.parseInt(video.getLike());
			} else {
				throw new RuntimeException("点赞失败!");
			}
		} catch (Exception e) {
			throw new RuntimeException("点赞失败:" + e.toString());
		}
	}
}
