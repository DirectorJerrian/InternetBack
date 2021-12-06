package com.netdevelop.demo.service;

import com.netdevelop.demo.po.Sign;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.SignVO;

import java.util.List;

public interface SignService {

    /**
     * 插入签到状态用户在当天已签到则返回已签到并不执行插入签到
     * @param signVO
     * @return
     */
    ResponseVO insertSign(SignVO signVO);

    /**
     * 返回用户所有的签到状态
     * @param userId
     * @return
     */
    List<Sign> getUserSigns(Integer userId);

}
