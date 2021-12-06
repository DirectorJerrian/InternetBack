package com.netdevelop.demo.controller;


import com.netdevelop.demo.service.UserService;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public ResponseVO getUserById(@RequestParam Integer userId){
        return ResponseVO.buildSuccess(userService.queryUserByUserId(userId));
    }

    /**
     * 返回user对象
     * @param userVO
     * @return
     */
    @PostMapping("/login")
    public ResponseVO login(@RequestBody UserVO userVO){
        return userService.login(userVO);
    }

    /**
     * 更新user信息
     * @param id
     * @param userName
     * @param userImg
     * @return 用户对象
     */
    @GetMapping("/updateUserInfo")
    public ResponseVO updateUserInfo(@RequestParam Integer id,@RequestParam String userName,@RequestParam String userImg){
        return userService.updateUserInfo(id,userName,userImg);
    }

}
