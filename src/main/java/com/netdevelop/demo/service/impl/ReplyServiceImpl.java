package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.ReplyDao;
import com.netdevelop.demo.po.Reply;
import com.netdevelop.demo.service.ReplyService;
import com.netdevelop.demo.vo.ReplyVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyDao replyDao;
    @Override
    public ResponseVO insertReply(ReplyVO replyVO) {
        Reply reply=new Reply();
        BeanUtils.copyProperties(replyVO,reply);
        int effectNum=replyDao.insertReply(reply);
        if(effectNum>0){
            return ResponseVO.buildSuccess("回复成功");
        }else{
            return ResponseVO.buildFailure("回复失败");
        }
    }

    @Override
    public List<ReplyVO> selectReplyByCommentId(Integer commentId) {
        List<Reply> replies=replyDao.selectReplyByCommentId(commentId);
        List<ReplyVO> replyVOS=new LinkedList<>();
        for(Reply reply:replies){
            ReplyVO replyVO=new ReplyVO();
            BeanUtils.copyProperties(reply,replyVO);
            replyVOS.add(replyVO);
        }
        return replyVOS;
    }

    @Override
    public ResponseVO updateReplyLike(Integer id, Integer change) {

        int effectNum=replyDao.updateReplyFavor(id,change);
        if(effectNum>0){
            if(change>0){
                return ResponseVO.buildSuccess("点赞成功");
            }else{
                return ResponseVO.buildSuccess("取消点赞成功");
            }

        }else{
            if(change>0){
                return ResponseVO.buildFailure("点赞失败");
            }else{
                return ResponseVO.buildFailure("取消点赞失败");
            }
        }
    }

    @Override
    public ResponseVO deleteReply(Integer id) {
        int effectNum=replyDao.deleteReply(id);
        if(effectNum>0){
            return ResponseVO.buildSuccess("删除回复成功");
        }else{
            return ResponseVO.buildFailure("删除回复失败");
        }
    }
}
