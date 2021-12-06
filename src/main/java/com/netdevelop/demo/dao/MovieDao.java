package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Movie;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDao {

    /**
     * 根据类型返回电影列表
     * 1，2，3分别对应热门，热映，榜单
     * @param type
     * @return
     */
    List<Movie> getSpecifiedMovieType(@Param("type") int type);

    /**
     * 根据电影Id返回该电影信息
     * @param id
     * @return
     */
    Movie queryMovieById(@Param("id") int id);


    /**
     * 返回所有电影（为搜索做准备）
     * @return
     */
    List<Movie> getAllMovies();

    /**
     * 插入一部新电影
     */
    int insertMovie(Movie movie);


    /**
     * 更新的点赞数
     * @param id
     * @param change 增加或者减少的点赞数
     * @return
     */
    int updateMovieLike(@Param("id")Integer id, @Param("change")Integer change);

}
