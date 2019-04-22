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

/**
 * 示例
 * 获取所有的新闻信息:http://172.17.191.121:8082/mybasketball//news/listnews?newsType=0
 * 通过Id获取新闻信息:http://localhost:8082/mybasketball//news/getnewsbyid?newsId=1
 */

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
    private Map<String, Object> listNews(Integer newsType) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<News> list = new ArrayList<News>();
        // 获取新闻列表
        list = newsService.getNewsList(newsType);
        modelMap.put("success", list);
        return modelMap;
    }

    /**
     * 通过Id获取新闻信息
     * @return
     */
    @RequestMapping(value = "/getnewsbyid", method = RequestMethod.GET)
    private Map<String, Object> geNewsById(Integer newsId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取新闻信息
        News news = newsService.getNewsById(newsId);
        modelMap.put("success", news);
        return modelMap;
    }

}
