package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.RecordDao;
import com.netdevelop.demo.po.Record;
import com.netdevelop.demo.service.MovieService;
import com.netdevelop.demo.service.RecordService;
import com.netdevelop.demo.vo.MovieVO;

import com.netdevelop.demo.vo.RecordVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordDao recordDao;
    @Autowired
    private MovieService movieService;

    @Override
    public List<RecordVO> getRecordsByUserId(int userId) {
        List<Record> recordList=recordDao.queryRecordByUserId(userId);
        List<RecordVO> recordVOS=recordList.stream().map(r->{
            RecordVO recordVO=new RecordVO();
            BeanUtils.copyProperties(r,recordVO);
            recordVO.setMovie(movieService.queryMovieById(r.getMovieId()));
            return recordVO;
        }).collect(Collectors.toList());
        return recordVOS;
    }

    @Transactional
    @Override
    public int insertRecord(RecordVO recordVO) {
        if(recordVO.getUserId()>0&&recordVO.getMovieId()>0){
            try {
                Record exist=recordDao.existMovieId(recordVO.getUserId(),recordVO.getMovieId());
                if(exist!=null){
                    return recordDao.updateRecord(recordVO.getUserId(),recordVO.getMovieId(),recordVO.getWatchTime());
                }else{
                    Record record=new Record();
                    BeanUtils.copyProperties(recordVO,record);
                    int effectNum=recordDao.insertRecord(record);
                    if(effectNum>0){
                        return effectNum;
                    }else{
                        throw new RuntimeException("浏览记录出错");
                    }
                }

            }catch (Exception e){
                throw new RuntimeException("浏览记录出错： "+e.toString());
            }
        }else{
            throw new RuntimeException("浏览者Id和电影不能为空！");
        }
    }

    @Override
    public List<MovieVO> getRecordMovieByUid(int userId) {
        List<Record> recordList=recordDao.queryRecordByUserId(userId);
        List<MovieVO> movieVOList=recordList.stream().map(r->{
            return movieService.queryMovieById(r.getMovieId());
        }).collect(Collectors.toList());
        return movieVOList;
    }


}
