package com.basketball.mybasketball.controller;

import com.basketball.mybasketball.entity.Video;
import com.basketball.mybasketball.service.VideoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 示例
 * 获取所有的视频信息:http://localhost:8082/mybasketball//video/listvideos
 * 通过Id获取视频信息:http://localhost:8082/mybasketball//video/getvideobyid?videoId=1
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    /**
     * 获取所有的视频信息
     * @return
     */
    @RequestMapping(value = "/listvideos", method = RequestMethod.GET)
    private Map<String, Object> listNews() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Video> list = new ArrayList<Video>();
        // 获取列表
        list = videoService.getVideoList();
        modelMap.put("success", list);
        return modelMap;
    }

    /**
     * 通过Id获取视频信息
     * @return
     */
    @RequestMapping(value = "/getvideobyid", method = RequestMethod.GET)
    private Map<String, Object> getVideoById(Integer videoId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 获取区域信息
        Video video = videoService.getVideoById(videoId);
        modelMap.put("success", video);
        return modelMap;
    }

    /**
     * 视频点赞
     * @param video
     * @param
     * @return
     * @throws IOException
     * @throws JsonMappingException
     * @throws JsonParseException
     */
    @RequestMapping(value = "/videolike", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody Video video)
            throws JsonParseException, JsonMappingException, IOException {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改用户信息
        modelMap.put("success", videoService.updateLikes(video));
        return modelMap;
    }

}
