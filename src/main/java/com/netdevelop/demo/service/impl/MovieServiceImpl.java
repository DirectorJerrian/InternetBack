package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.MovieDao;
import com.netdevelop.demo.po.Movie;
import com.netdevelop.demo.service.MovieService;
import com.netdevelop.demo.service.PerformerService;
import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.PerformerVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieDao movieDao;
    @Autowired
    private PerformerService performerService;
    @Override
    public List<MovieVO> getSpecifiedMovieType(int type) {
        List<Movie> movies=movieDao.getSpecifiedMovieType(type);
        List<MovieVO> movieVOS=new LinkedList<>();
        for(Movie movie:movies){
            MovieVO movieVO=new MovieVO();
            BeanUtils.copyProperties(movie,movieVO);
            List<PerformerVO> performerVOS=performerService.getPerformerByMovieId(movieVO.getId());
            movieVO.setPerformers(performerVOS);
            movieVOS.add(movieVO);
        }
        return movieVOS;
    }

    @Override
    public MovieVO queryMovieById(int movieId) {
        Movie movie=movieDao.queryMovieById(movieId);
        MovieVO movieVO=new MovieVO();
        BeanUtils.copyProperties(movie,movieVO);
        List<PerformerVO> performerVOS=performerService.getPerformerByMovieId(movieVO.getId());
        movieVO.setPerformers(performerVOS);
        return movieVO;
    }

    @Override
    public int insertMovie(MovieVO movieVO) {
        Movie movie=new Movie();
        BeanUtils.copyProperties(movieVO,movie);
        return movieDao.insertMovie(movie);
    }

    @Override
    public List<MovieVO> searchByKeyWords(String key) {
        List<Movie> movies=movieDao.getAllMovies();
        boolean [] visited=new boolean[movies.size()];
        List<MovieVO> movieVOS=new LinkedList<>();
        for(int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if(movie.getMovieName().equals(key)){
                MovieVO movieVO=new MovieVO();
                BeanUtils.copyProperties(movie,movieVO);
                movieVOS.add(movieVO);
                visited[i]=true;
            }
        }
        for(int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if(movie.getMovieName().contains(key)&&visited[i]==false){
                MovieVO movieVO=new MovieVO();
                BeanUtils.copyProperties(movie,movieVO);
                movieVOS.add(movieVO);
                visited[i]=true;
            }
        }
        for(int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if(movie.getActors().equals(key)&&visited[i]==false){
                MovieVO movieVO=new MovieVO();
                BeanUtils.copyProperties(movie,movieVO);
                movieVOS.add(movieVO);
                visited[i]=true;
            }
        }
        for(int i=0;i<movies.size();i++){
            Movie movie=movies.get(i);
            if(movie.getActors().contains(key)&&visited[i]==false){
                MovieVO movieVO=new MovieVO();
                BeanUtils.copyProperties(movie,movieVO);
                movieVOS.add(movieVO);
                visited[i]=true;
            }
        }
        return movieVOS;
    }

    @Override
    public ResponseVO updateMovieLike(Integer id, Integer change) {
        int effectNum=movieDao.updateMovieLike(id,change);
        if(effectNum>0){
            return ResponseVO.buildSuccess("点赞成功");
        }else{
            return ResponseVO.buildFailure("点赞失败");
        }
    }
}
