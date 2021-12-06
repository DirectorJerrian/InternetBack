package com.netdevelop.demo.service;

import com.netdevelop.demo.vo.ReplyVO;
import com.netdevelop.demo.vo.ResponseVO;

import java.util.List;

public interface ReplyService {
    /**
     * 插入一条新的评论
     * @param replyVO
     */
    ResponseVO insertReply(ReplyVO replyVO);

    /**
     * 根据评论id获取所有的子评论
     * @param commentId
     * @return
     */
    List<ReplyVO> selectReplyByCommentId(Integer commentId);

    /**
     * 改变点赞数
     * @param id
     */
    ResponseVO updateReplyLike(Integer id,Integer change);

    /**
     * 删除回复
     * @param id
     * @return
     */
    ResponseVO deleteReply(Integer id);

}
