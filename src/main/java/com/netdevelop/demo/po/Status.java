package com.netdevelop.demo.po;

public class Status {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 评论者
     */
    private Integer userId;

    /**
     * 电影Id,为评论状态时commentId为-1，
     */
    private Integer commentId;

    /**
     * 状态 1代表 喜欢 ，0 代表不喜欢
     */
    private Integer state;

    /**
     * 回复id，为回复状态时replyId为-1
     */
    private Integer replyId;

    /**
     *
     * @return
     */
    private Integer movieId;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
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

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
