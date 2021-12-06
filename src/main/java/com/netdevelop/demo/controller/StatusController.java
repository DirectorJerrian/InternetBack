package com.netdevelop.demo.controller;

import com.netdevelop.demo.service.StatusService;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.StatusVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @PostMapping("/addStatus")
    public ResponseVO addStatus(@RequestBody StatusVO statusVO){
        return statusService.insertStatus(statusVO);
    }

    @GetMapping("/updateCommentStatus")
    public ResponseVO updateCommentStatus(@RequestParam Integer userId,@RequestParam Integer commentId,@RequestParam Integer state){
        return statusService.updateCommentStatus(userId,commentId,state);
    }

    @GetMapping("/updateReplyStatus")
    public ResponseVO updateReplyStatus(@RequestParam Integer userId,@RequestParam Integer replyId,@RequestParam Integer state){
        return statusService.updateReplyStatus(userId,replyId,state);
    }

    @GetMapping("/deleteCommentStatus")
    public ResponseVO deleteCommentStatus(@RequestParam Integer userId,@RequestParam Integer commentId){
        return statusService.deleteCommentStatus(userId,commentId);
    }

    @GetMapping("/deleteReplyStatus")
    public ResponseVO deleteReplyStatus(@RequestParam Integer userId,@RequestParam Integer replyId){
        return statusService.deleteReplyStatus(userId,replyId);
    }

    @GetMapping("/getAllStatus")
    public ResponseVO getAllStatus(){
        return statusService.getAllStatus();
    }

    @GetMapping("/updateMovieStatus")
    public ResponseVO updateMovieStatus(@RequestParam Integer userId,@RequestParam Integer movieId,@RequestParam Integer state){
        return statusService.updateMovieStatus(userId,movieId,state);
    }

    @GetMapping("/deleteMovieStatus")
    public ResponseVO deleteMovieStatus(@RequestParam Integer userId,@RequestParam Integer movieId){
        return statusService.deleteMovieStatus(userId,movieId);
    }
}
