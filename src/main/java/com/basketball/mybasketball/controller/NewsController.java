package com.basketball.mybasketball.controller;

import com.basketball.mybasketball.entity.News;
import com.basketball.mybasketball.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    /**
     * 获取所有的新闻信息
     * @return
     */
    @RequestMapping(value = "/listnews", method = RequestMethod.GET)
    private Map<String, Object> listNews() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<News> list = new ArrayList<News>();
        // 获取区域列表
        list = newsService.getNewsList();
        modelMap.put("newsList", list);
        return modelMap;
    }

    /**
     * 通过Id获取新闻信息
     * @return
     */
    @RequestMapping(value = "/getnewsbyid", method = RequestMethod.GET)
    private Map<String, Object> geNewsById(Integer newsId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        News news = newsService.getNewsById(newsId);
        modelMap.put("news", news);
        return modelMap;
    }

}
