package com.netdevelop.demo.service;

import com.netdevelop.demo.vo.CommentVO;

import java.util.List;

public interface CommentService {

    /**
     * 根据电影id返回该电影的所有评论
     * @param movieId
     * @return
     */
    List<CommentVO> queryCommentByMovieId(int movieId);

    /**
     * 时间降序
     * @param movieId
     * @return
     */
    List<CommentVO> queryCommentOrderByTime(int movieId);

    /**
     * 点赞降序
     * @param movieId
     * @return
     */
    List<CommentVO> queryCommentOrderByFavor(int movieId);

    /**
     * 评分升序
     * @param movieId
     * @return
     */
    List<CommentVO> queryCommentOrderByScoreAsc(int movieId);

    /**
     * 评分降序
     * @param movieId
     * @return
     */
    List<CommentVO> queryCommentOrderByScoreDesc(int movieId);



    /**
     * 根据用户id返回该用户所有的评论
     * @param userId
     * @return
     */
    List<CommentVO> queryCommentByuserId(int userId);

    /**
     * 插入一条新的评论
     * @param commentVO
     * @return
     */
    boolean insertComment(CommentVO commentVO);

    /**
     * 删除特定评论（暂时只在影评记录中可删除）
     * @param commentId
     * @return
     */
    boolean deleteComment(int commentId);

    /**
     * 改变点赞数
     * @param id
     */
    void updateCommentLike(Integer id,Integer change);

    /**
     * 获得特定数量的评论
     * @param movieId
     * @param limited
     * @return
     */
    List<CommentVO> getLimitedComment(Integer movieId,Integer limited,Integer offset,Integer type);
}
