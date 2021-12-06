package com.netdevelop.demo.po;

public class Performer {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 电影id
     */
    private Integer movieId;

    /**
     * 演员名
     */
    private String performerName;

    /**
     * 演员头像
     */
    private String performerAvatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getPerformerName() {
        return performerName;
    }

    public void setPerformerName(String performerName) {
        this.performerName = performerName;
    }

    public String getPerformerAvatar() {
        return performerAvatar;
    }

    public void setPerformerAvatar(String performerAvatar) {
        this.performerAvatar = performerAvatar;
    }
}
