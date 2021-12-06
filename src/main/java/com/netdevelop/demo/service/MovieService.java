package com.netdevelop.demo.service;

import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.ResponseVO;

import java.util.List;

public interface MovieService {
    /**
     * 根据类型返回电影列表
     * 1，2，3分别对应热门，热映，榜单
     * @param type
     * @return
     */
    List<MovieVO> getSpecifiedMovieType(int type);

    /**
     * 根据电影Id返回该电影信息
     * @param movieId
     * @return
     */
    MovieVO queryMovieById(int movieId);

    /**
     * 插入新的电影
     */
    int insertMovie(MovieVO movieVO);

    /**
     * 根据关键字进行搜索
     * @param key
     * @return
     */
    List<MovieVO> searchByKeyWords(String key);

    /**
     * 添加电影的点赞
     * @param id
     * @param change
     * @return
     */
    ResponseVO updateMovieLike(Integer id,Integer change);
}
