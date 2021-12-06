package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao {

    /**
     * 根据电影id返回该电影的所有评论
     * @param movieId
     * @return
     */
    List<Comment> queryCommentByMovieId(@Param("movieId") int movieId);

    /**
     * 根据用户id返回该用户所有的评论
     * @param userId
     * @return
     */
    List<Comment> queryCommentByuserId(@Param("userId") int userId);

    /**
     * 插入一条新的评论
     * @param comment
     * @return
     */
    int insertComment(Comment comment);

    /**
     * 删除特定评论（暂时只在影评记录中可删除）
     * @param id
     * @return
     */
    int deleteComment(@Param("id") int id);

    /**
     * 更新的点赞数
     * @param id
     * @param change 增加或者减少的点赞数
     * @return
     */
    int updateCommentLike(@Param("id")Integer id, @Param("change")Integer change);

    /**
     * 评论的时间降序
     * @param movieId
     * @return
     */
    List<Comment> queryCommentOrderByTime(@Param("movieId") int movieId);


    /**
     * 评论的点赞降序
     * @param movieId
     * @return
     */
    List<Comment> queryCommentOrderByFavor(@Param("movieId") int movieId);


    /**
     * 评论的评分降序
     * @param movieId
     * @return
     */
    List<Comment> queryCommentOrderByScoreDesc(@Param("movieId") int movieId);


    /**
     * 评论的评分升序
     * @param movieId
     * @return
     */
    List<Comment> queryCommentOrderByScoreAsc(@Param("movieId") int movieId);

}
