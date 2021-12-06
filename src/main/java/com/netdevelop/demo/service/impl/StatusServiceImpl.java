package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.StatusDao;
import com.netdevelop.demo.po.Status;
import com.netdevelop.demo.service.StatusService;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.StatusVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusDao statusDao;

    @Override
    public ResponseVO insertStatus(StatusVO statusVO) {
        Status status=new Status();
        BeanUtils.copyProperties(statusVO,status);
        int effectNum=statusDao.insertStatus(status);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("插入状态失败");
        }
    }

    @Override
    public ResponseVO updateCommentStatus(Integer userId, Integer commentId, Integer state) {
        int effectNum=statusDao.updateCommentStatus(userId,commentId,state);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("更新评论状态失败");
        }
    }

    @Override
    public ResponseVO updateReplyStatus(Integer userId, Integer replyId, Integer state) {
        int effectNum=statusDao.updateReplyStatus(userId,replyId,state);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("更新回复状态失败");
        }
    }

    @Override
    public ResponseVO deleteCommentStatus(Integer userId, Integer commentId) {
        int effectNum=statusDao.deleteCommentStatus(userId,commentId);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("删除评论状态失败");
        }
    }

    @Override
    public ResponseVO deleteReplyStatus(Integer userId, Integer replyId) {
        int effectNum=statusDao.deleteCommentStatus(userId,replyId);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("删除回复状态失败");
        }
    }

    @Override
    public ResponseVO getAllStatus() {
        List<Status> statusList=statusDao.getAllStatus();
        List<StatusVO> statusVOList=new LinkedList<>();
        for(Status status: statusList){
            StatusVO statusVO=new StatusVO();
            BeanUtils.copyProperties(status,statusVO);
            statusVOList.add(statusVO);
        }
        return ResponseVO.buildSuccess(statusVOList);

    }

    @Override
    public ResponseVO updateMovieStatus(Integer userId, Integer movieId, Integer state) {
        int effectNum=statusDao.updateMovieStatus(userId,movieId,state);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("更新想看状态失败");
        }
    }

    @Override
    public ResponseVO deleteMovieStatus(Integer userId, Integer movieId) {
        int effectNum=statusDao.deleteCommentStatus(userId,movieId);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("删除想看状态失败");
        }
    }
}
