package com.netdevelop.demo.service;

import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.StatusVO;

public interface StatusService {
    /**
     * 插入一条新的评论/回复状态
     * @param statusVO
     * @return
     */
    ResponseVO insertStatus(StatusVO statusVO);

    /**
     * 更新评论状态
     * @param userId
     * @param commentId
     * @param state
     * @return
     */
    ResponseVO updateCommentStatus(Integer userId,Integer commentId,Integer state);

    /**
     * 更新回复状态
     * @param userId
     * @param replyId
     * @param state
     * @return
     */
    ResponseVO updateReplyStatus( Integer userId,Integer replyId,Integer state);

    /**
     * 删除评论状态
     * @param userId
     * @param commentId
     * @return
     */
    ResponseVO deleteCommentStatus( Integer userId,Integer commentId);

    /**
     * 删除回复状态
     * @param userId
     * @param replyId
     * @return
     */
    ResponseVO deleteReplyStatus(Integer userId,Integer replyId);

    /**
     * 获得所有的状态
     * @return
     */
    ResponseVO getAllStatus();

    /**
     * 更新回复状态
     * @param userId
     * @param movieId
     * @param state
     * @return
     */
    ResponseVO updateMovieStatus( Integer userId,Integer movieId,Integer state);

    /**
     * 删除评论状态
     * @param userId
     * @param movieId
     * @return
     */
    ResponseVO deleteMovieStatus( Integer userId,Integer movieId);


}
