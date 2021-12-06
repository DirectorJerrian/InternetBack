package com.netdevelop.demo.vo;

public class UserVO {
    //用户：用户id（int），用户名（string），用户头像（string）,
    //用户数据库的主键
    private int userId;
    //用户名
    private String userName;
    //用户的头像图片url
    private String userImg;
    //获取openid和sessionkey的参数
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
