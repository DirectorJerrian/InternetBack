package com.netdevelop.demo.controller;

import com.netdevelop.demo.service.ExpectService;
import com.netdevelop.demo.vo.ExpectVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expect")
public class ExpectController {

    @Autowired
    private ExpectService expectService;

    @PostMapping("/insertExpect")
    public ResponseVO insertExpect(@RequestBody ExpectVO expectVO){
        return  expectService.insertExpect(expectVO);
    }

    @GetMapping("/deleteExpect")
    public ResponseVO deleteExpect(@RequestParam Integer id) {
        return expectService.deleteExpect(id);
    }

    @GetMapping("/deleteExpectByUM")
    public ResponseVO deleteExpectByUM(@RequestParam Integer userId,@RequestParam Integer movieId) {
        return expectService.deleteExpectByUM(userId,movieId);
    }

    @GetMapping("/getExpectByUserId")
    public ResponseVO getExpectByUserId(@RequestParam Integer userId){
        return ResponseVO.buildSuccess(expectService.getExpectByUserId(userId));
    }

    @GetMapping("/getExpectMovieByUserId")
    public ResponseVO getExpectMovieByUserId(@RequestParam Integer userId){
        return ResponseVO.buildSuccess(expectService.getExpectMovieByUserId(userId));
    }

    @GetMapping("/getExpectByMovieId")
    public ResponseVO getExpectByMovieId(@RequestParam Integer movieId){
        return ResponseVO.buildSuccess(expectService.getExpectByMovieId(movieId));
    }

    @GetMapping("/getSpecifiedExpect")
    public ResponseVO getExpectByUm(@RequestParam Integer userId,@RequestParam Integer movieId){
        return ResponseVO.buildSuccess(expectService.getSpecifiedExpect(movieId, userId));
    }

    @GetMapping("/updateExpect")
    public ResponseVO updateExpect(@RequestParam Integer userId,
                                   @RequestParam Integer movieId,
                                   @RequestParam Double longitude,
                                   @RequestParam Double latitude){
        return ResponseVO.buildSuccess(expectService.updateExpect(movieId, userId,longitude,latitude));
    }

}
