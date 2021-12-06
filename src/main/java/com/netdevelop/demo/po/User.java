package com.netdevelop.demo.po;

public class User {
    //用户：用户id（int），用户名（string），用户头像（string）,
    //用户数据库的主键
    private Integer id;
    //用户名
    private String userName;
    //用户的头像图片url
    private String userImg;
    //用户唯一标识
    private String openId;
    //sessionKey
    private String sessionKey;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}
