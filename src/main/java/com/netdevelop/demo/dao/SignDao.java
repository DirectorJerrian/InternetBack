package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Sign;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignDao {

    int insertSign(Sign sign);

    List<Sign> selectSignByUserId(@Param("userId")Integer userId);

    Sign querySign(@Param("userId")Integer userId, @Param("year")Integer year, @Param("month")Integer month, @Param("day")Integer day);
}
