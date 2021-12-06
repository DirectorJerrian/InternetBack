package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.ExpectDao;
import com.netdevelop.demo.po.Expect;
import com.netdevelop.demo.po.Record;
import com.netdevelop.demo.service.ExpectService;
import com.netdevelop.demo.service.MovieService;
import com.netdevelop.demo.vo.ExpectVO;
import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExpectServiceImpl implements ExpectService {

    @Autowired
    private ExpectDao expectDao;

    @Autowired
    private MovieService movieService;

    @Override
    public ResponseVO insertExpect(ExpectVO expectVO) {
        Expect expect=new Expect();
        BeanUtils.copyProperties(expectVO,expect);
        int effectNum=expectDao.insertExpect(expect);
        if(effectNum>0){
            return ResponseVO.buildSuccess("true");
        }else{
            return ResponseVO.buildFailure("添加想看失败");
        }
    }

    @Override
    public ResponseVO deleteExpect(Integer id) {
        int effectNum=expectDao.deleteExpect(id);
        if(effectNum>0){
            return ResponseVO.buildSuccess("true");
        }else{
            return ResponseVO.buildFailure("撤销想看失败");
        }
    }

    @Override
    public ResponseVO deleteExpectByUM(Integer userId, Integer movieId) {
        int effectNum=expectDao.deleteExpectByUM(userId,movieId);
        if(effectNum>0){
            return ResponseVO.buildSuccess("true");
        }else{
            return ResponseVO.buildFailure("撤销想看失败");
        }
    }

    @Override
    public List<ExpectVO> getExpectByUserId(Integer userId) {
        List<Expect> expects=expectDao.getExpectByUserId(userId);
        List<ExpectVO> expectVOS=expects.stream().map(r->{
            ExpectVO expectVO=new ExpectVO();
            BeanUtils.copyProperties(r,expectVO);
            return expectVO;
        }).collect(Collectors.toList());
        return expectVOS;
    }

    @Override
    public List<MovieVO> getExpectMovieByUserId(Integer userId) {
        List<Expect> expects=expectDao.getExpectByUserId(userId);
        List<MovieVO> movieVOList=new LinkedList<>();
        for(Expect expect:expects){
            movieVOList.add(movieService.queryMovieById(expect.getMovieId()));
        }
        return movieVOList;
    }

    @Override
    public List<ExpectVO> getExpectByMovieId(Integer movieId) {
        List<Expect> expects=expectDao.getExpectByMovieId(movieId);
        List<ExpectVO> expectVOS=expects.stream().map(r->{
            ExpectVO expectVO=new ExpectVO();
            BeanUtils.copyProperties(r,expectVO);
            return expectVO;
        }).collect(Collectors.toList());
        return expectVOS;
    }

    @Override
    public ExpectVO getSpecifiedExpect(Integer movieId, Integer userId) {
        Expect expect=expectDao.getSpecifiedExpect(movieId,userId);
        ExpectVO expectVO=new ExpectVO();
        BeanUtils.copyProperties(expect,expectVO);
        return expectVO;
    }

    @Override
    public ResponseVO updateExpect(Integer movieId, Integer userId, Double longitude, Double latitude) {
        int effectNum=expectDao.updateExpect(movieId,userId,longitude,latitude);
        if(effectNum>0){
            return ResponseVO.buildSuccess();
        }else{
            return ResponseVO.buildFailure("更新用户位置失败");
        }
    }

}
