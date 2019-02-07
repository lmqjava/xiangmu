package com.wuliu.pojo;

import java.io.Serializable;

public class News implements Serializable {
    private Integer pressnumber;

    private String newshead;

    private String writer;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getPressnumber() {
        return pressnumber;
    }

    public void setPressnumber(Integer pressnumber) {
        this.pressnumber = pressnumber;
    }

    public String getNewshead() {
        return newshead;
    }

    public void setNewshead(String newshead) {
        this.newshead = newshead == null ? null : newshead.trim();
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}