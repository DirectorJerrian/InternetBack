package com.netdevelop.demo.vo;

import java.time.LocalDateTime;

public class SignVO {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 进行签到用户id
     */
    private Integer userId;

    /**
     * 进行签到的时间
     */
    private String date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
