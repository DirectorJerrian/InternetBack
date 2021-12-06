package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Status;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusDao {

    /**
     * 插入一条新的评论/回复状态
     * @param status
     * @return
     */
    int insertStatus(Status status);

    /**
     * 更新评论状态
     * @param userId
     * @param commentId
     * @param state
     * @return
     */
    int updateCommentStatus(@Param("userId") Integer userId,@Param("commentId") Integer commentId, @Param("state")Integer state);

    /**
     * 更新回复状态
     * @param userId
     * @param replyId
     * @param state
     * @return
     */
    int updateReplyStatus(@Param("userId") Integer userId,@Param("replyId") Integer replyId, @Param("state")Integer state);

    /**
     *
     * @param userId
     * @param movieId
     * @param state
     * @return
     */
    int updateMovieStatus(@Param("userId") Integer userId,@Param("movieId") Integer movieId, @Param("state")Integer state);


    /**
     * 删除评论状态
     * @param userId
     * @param movieId
     * @return
     */
    int deleteMovieStatus(@Param("userId") Integer userId,@Param("movieId") Integer movieId);


    /**
     * 删除评论状态
     * @param userId
     * @param commentId
     * @return
     */
    int deleteCommentStatus(@Param("userId") Integer userId,@Param("commentId") Integer commentId);

    /**
     * 删除回复状态
     * @param userId
     * @param replyId
     * @return
     */
    int deleteReplyStatus(@Param("userId") Integer userId,@Param("replyId") Integer replyId);

    /**
     * 获得所有的状态
     * @return
     */
    List<Status> getAllStatus();
}
