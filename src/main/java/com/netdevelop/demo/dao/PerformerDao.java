package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.Performer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerformerDao {

    int insertPerformer(Performer performer);

    List<Performer> getPerformerByMovieId(@Param("movieId")Integer movieId);
}
