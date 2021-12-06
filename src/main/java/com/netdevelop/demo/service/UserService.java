package com.netdevelop.demo.service;

import com.netdevelop.demo.po.User;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.UserVO;

public interface UserService {

    /**
     * 根据用户Id返回该用户信息
     * @param userId
     * @return
     */
    User queryUserByUserId(int userId);

    /**
     * 添加新的用户
     * @param userVO
     * @return
     */
    ResponseVO login(UserVO userVO);

    ResponseVO updateUserInfo( Integer id, String userName, String userImg);
}
