package com.netdevelop.demo.controller;

import com.netdevelop.demo.service.SignService;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.SignVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign")
public class SignController {
    @Autowired
    private SignService signService;

    @PostMapping("/insert")
    ResponseVO insertSign(SignVO signVO){
        return signService.insertSign(signVO);
    }

    @GetMapping("/getSignByUserId")
    ResponseVO selectSignsByUserId(@RequestParam Integer userId){
        return ResponseVO.buildSuccess(signService.getUserSigns(userId));
    }
}
