package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.PerformerDao;
import com.netdevelop.demo.po.Performer;
import com.netdevelop.demo.service.PerformerService;
import com.netdevelop.demo.vo.PerformerVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerformerServiceImpl  implements PerformerService {

    @Autowired
    private PerformerDao performerDao;

    @Override
    public int insertPerformer(PerformerVO performerVO) {
        Performer performer=new Performer();
        BeanUtils.copyProperties(performerVO,performer);
        return performerDao.insertPerformer(performer);
    }

    @Override
    public List<PerformerVO> getPerformerByMovieId(Integer movieId) {
        List<Performer> performers=performerDao.getPerformerByMovieId(movieId);
        List<PerformerVO> performerVOS=performers.stream().map(p->{
            PerformerVO performerVO=new PerformerVO();
            BeanUtils.copyProperties(p,performerVO);
            return performerVO;
        }).collect(Collectors.toList());
        return performerVOS;
    }
}
