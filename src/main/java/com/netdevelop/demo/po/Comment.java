package com.netdevelop.demo.po;

import java.time.LocalDateTime;

public class Comment {

   // 评论：id（int),电影ID，用户ID，评论时间（datetime），内容（string），点赞数（int）
    //Comment数据库主键ID
    private Integer id;
    //评论针对的电影ID
    private Integer movieId;
    //发表评论的用户Id
    private Integer userId;
    //评论创建的时间
    private String createTime;
    //评论的内容
    private  String content;

    //该评论收到的点赞数
    private Integer likes;

    //评论者的昵称
    private String userName;

    //评论者的头像
    private String userAvatar;
    //评论为电影打分
    private double score;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
