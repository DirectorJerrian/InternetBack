package com.netdevelop.demo.service;

import com.netdevelop.demo.po.Expect;
import com.netdevelop.demo.vo.ExpectVO;
import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpectService {

    /**
     * 插入想看的电影
     * @param expectVO
     * @return
     */
    ResponseVO insertExpect(ExpectVO expectVO);

    /**
     * 删除想看的状态
     * @param id
     * @return
     */
    ResponseVO deleteExpect(Integer id);

    /**
     * 删除特定的状态
     * @param userId
     * @param movieId
     * @return
     */
    ResponseVO deleteExpectByUM(Integer userId,Integer movieId);

    /**
     * 根据用户id获取用户所有的想看状态
     * @param userId
     * @return
     */
    List<ExpectVO> getExpectByUserId(Integer userId);

    /**
     * 根据用户id获取用户所有的想看状态
     * @param userId
     * @return
     */
    List<MovieVO> getExpectMovieByUserId(Integer userId);


    /**
     * 根据电影id获得所有想看状态
     * @param movieId
     * @return
     */
    List<ExpectVO> getExpectByMovieId(Integer movieId);

    /**
     * 获取特定的想看
     * @param movieId
     * @param userId
     * @return
     */
    ExpectVO getSpecifiedExpect( Integer movieId , Integer userId);

    /**
     * 更新用户所在的位置
     * @param movieId
     * @param userId
     * @param longitude
     * @param latitude
     * @return
     */
    ResponseVO updateExpect(Integer movieId,Integer userId,Double longitude,Double latitude);

}
