package com.netdevelop.demo.service;

import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.RecordVO;

import java.util.List;

public interface RecordService {

    /**
     * 根据UserId去查询该用户所浏览的所有电影
     * @param userId
     * @return
     */
    List<RecordVO> getRecordsByUserId(int userId);

    /**
     * 添加一条浏览记录
     * @param recordVO
     * @return
     */
    int insertRecord(RecordVO recordVO);


    /**
     * 根据UserId去查询该用户所浏览的所有电影
     * @param userId
     * @return
     */
    List<MovieVO> getRecordMovieByUid(int userId);



}
