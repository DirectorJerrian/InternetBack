package com.netdevelop.demo.po;

import java.time.LocalDateTime;

public class Reply {


    /**
     * 回复id
     */
    private Integer id;

    /**
     * 回复的评论Id
     */
    private Integer commentId;

    /**
     * 发起回复者的ID
     */
    private Integer fromId;

    /**
     * 发起回复者的名称
     */
    private String fromName;

    /**
     * 发起回复者的头像Url
     */
    private String fromAvatar;

    /**
     * 被回复者的Id
     */
    private Integer toId;

    /**
     * 被回复者的名字
     */
    private String toName;

    /**
     * 被回复者的头像
     */
    private String toAvatar;

    /**
     * 回复内容
     */
    private String content;

    /**
     * 回复创建的时间
     */
    private String createTime;

    /**
     * 回复收到的点赞
     */
    private Integer favor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFromAvatar() {
        return fromAvatar;
    }

    public void setFromAvatar(String fromAvatar) {
        this.fromAvatar = fromAvatar;
    }

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToAvatar() {
        return toAvatar;
    }

    public void setToAvatar(String toAvatar) {
        this.toAvatar = toAvatar;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getFavor() {
        return favor;
    }

    public void setFavor(Integer favor) {
        this.favor = favor;
    }

}
