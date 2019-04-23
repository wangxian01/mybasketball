package com.basketball.mybasketball.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class UploadController {

    /**
     * 日志记录
     */
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);

    /**
     * 文件上传路径
     */
//    @Value("${beautylife.upload-path}")
    private String uploadPath;


    @Autowired
    private JdbcTemplate jdbcTemplate;
    private int type;
    private String videoname;

    //笔记发表
    @PostMapping(value = "/upload", headers = "content-type=multipart/form-data")
    public List<String> uploadImage(@RequestParam MultipartFile[] files) throws IOException {
        System.out.println("上传文件数量" + files.length);
        List<String> imgList = new ArrayList<>();
        String path = uploadPath + "repository/";
        File file = new File(path);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
            logger.info("url /upload/uploadImage => 创建文件上传目录" + path);
        }
        if (files == null) {
            logger.info("url /upload/uploadImage => Current request is not a multipart request");
            return imgList;
        }

        for (MultipartFile img : files) {
            String filename = img.getOriginalFilename();
            // 生成32位uuid通用唯一识别码作为图片的名称, 全小写
            // String uuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();

            // 将InputStream转为byte[]
            InputStream is = img.getInputStream();
            byte[] bytes = new byte[is.available()];
            is.read(bytes);
            is.close();
            // 写入文件
            FileOutputStream fos = new FileOutputStream(path + filename);
            fos.write(bytes);
            fos.close();
            // 存入集合
            imgList.add(filename);
            //提取出文件名及后缀
            String houzhui = filename.substring(filename.indexOf(".") + 1);
            if (houzhui.equals("jpeg") || houzhui.equals("png") || houzhui.equals("jpg")) {
                jdbcTemplate.execute("insert into home_details_pic(note_id,picurl)value ('666','"+filename+"')");
            } else if (houzhui.equals("mp4")) {
            }
        }


        return imgList;
    }

}
