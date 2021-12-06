package com.netdevelop.demo.vo;

public class PerformerVO {

    private Integer id;

    private Integer movieId;

    private String performerName;

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
