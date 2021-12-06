package com.netdevelop.demo.vo;

import com.netdevelop.demo.po.Movie;

import java.time.LocalDateTime;
import java.util.List;

public class RecordVO {
    private Integer id;
    //该条记录对应的用户Id
    private Integer userId;
    //该条记录对应的电影Id
    private Integer movieId;

    private MovieVO movie;
    //评论创建的时间
    private String watchTime;

    public MovieVO getMovie() {
        return movie;
    }

    public void setMovie(MovieVO movie) {
        this.movie = movie;
    }

    public String getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(String watchTime) {
        this.watchTime = watchTime;
    }

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

}
