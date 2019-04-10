package com.basketball.mybasketball.entity;

import javax.xml.crypto.Data;
import java.util.Date;

public class News {

    /**
     * 新闻id
     */
    private int id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻图片
     */
    private String img;

    /**
     * 新闻来源
     */
    private String source;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻时间
     */
    private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", source='" + source + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
