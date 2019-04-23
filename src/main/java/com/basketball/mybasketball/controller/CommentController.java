package com.basketball.mybasketball.controller;

import com.basketball.mybasketball.entity.Comment;
import com.basketball.mybasketball.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 示例
 * 根据新闻id获取新闻评论:http://172.17.133.163:8082/mybasketball//comment/getcommentlist?newsId=26
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 用户评论篮球资讯
     * @param comment
     * @return
     */
    @RequestMapping(value = "/insertcomment",method = RequestMethod.POST)
    private Map<String,Object> insertComment(@RequestBody Comment comment){
        Map<String, Object> modelMap = new HashMap<String, Object>();
        modelMap.put("success", commentService.insertComment(comment));
        return modelMap;
    }

    /**
     * 通过篮球资讯id获取评论列表
     * @return
     */
    @RequestMapping(value = "/getcommentlist", method = RequestMethod.GET)
    private Map<String, Object> getcomment(Integer newsId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Comment> commentList = commentService.getCommentList(newsId);
        modelMap.put("success", commentList);
        return modelMap;
    }

}
