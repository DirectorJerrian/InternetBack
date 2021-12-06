package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RecordDao {

    /**
     * 根据UserId去查询该用户所浏览记录
     * @param userId
     * @return
     */
    List<Record> queryRecordByUserId(@Param("userId") int userId);


    /**
     * 添加一条浏览记录
     * @param record
     * @return
     */
    int insertRecord(Record record);

    /**
     * 判断是否看过该电影
     */
    Record existMovieId(@Param("userId") int userId,@Param("movieId") int movieId);

    /**
     * 已经浏览过则更新时间
     * @param userId
     * @param movieId
     * @param watchTime
     * @return
     */
    int updateRecord(@Param("userId") int userId, @Param("movieId") int movieId,@Param("watchTime") String watchTime);
}
