package com.netdevelop.demo.po;

import java.time.LocalDateTime;

public class Record {
    //电影记录：id，用户id，电影id；
    //电影记录数据库的主键
    private Integer id;
    //该条记录对应的用户Id
    private Integer userId;
    //该条记录对应的电影Id
    private Integer movieId;

    //评论创建的时间
    private String watchTime;

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

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(String watchTime) {
        this.watchTime = watchTime;
    }
}
