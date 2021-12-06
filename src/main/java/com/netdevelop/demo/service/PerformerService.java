package com.netdevelop.demo.service;

import com.netdevelop.demo.po.Performer;
import com.netdevelop.demo.vo.PerformerVO;

import java.util.List;

public interface PerformerService {

    int insertPerformer(PerformerVO performerVO);

    List<PerformerVO> getPerformerByMovieId(Integer movieId);

}
