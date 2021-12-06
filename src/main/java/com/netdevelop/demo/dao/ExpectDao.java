package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Expect;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpectDao {

    /**
     * 插入想看的电影
     * @param expect
     * @return
     */
    int insertExpect(Expect expect);

    /**
     * 更新用户所在的位置
     * @param movieId
     * @param userId
     * @param longitude
     * @param latitude
     * @return
     */
    int updateExpect(@Param("movieId")Integer movieId,@Param("userId") Integer userId,@Param("longitude")Double longitude,@Param("latitude")Double latitude);

    /**
     * 删除想看的状态
     * @param id
     * @return
     */
    int deleteExpect(@Param("id")Integer id);

    /**
     * 删除特定的状态
     * @param userId
     * @param movieId
     * @return
     */
    int deleteExpectByUM(@Param("userId")Integer userId,@Param("movieId")Integer movieId);

    /**
     * 根据用户id获取用户所有的想看状态
     * @param userId
     * @return
     */
    List<Expect> getExpectByUserId(@Param("userId")Integer userId);

    /**
     * 根据电影id获得所有想看状态
     * @param movieId
     * @return
     */
    List<Expect> getExpectByMovieId(@Param("movieId")Integer movieId);

    /**
     * 获取特定的想看
     * @param movieId
     * @param userId
     * @return
     */
    Expect getSpecifiedExpect(@Param("movieId")Integer movieId,@Param("userId")Integer userId);
}
