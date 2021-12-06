package com.netdevelop.demo.controller;

import com.netdevelop.demo.service.MovieService;
import com.netdevelop.demo.vo.MovieVO;
import com.netdevelop.demo.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/type")
    public ResponseVO getMovieByType(@RequestParam Integer type){
        return ResponseVO.buildSuccess(movieService.getSpecifiedMovieType(type));
    }

    @GetMapping("/{movieId}")
    public ResponseVO getMovieById(@PathVariable Integer movieId){
        return ResponseVO.buildSuccess(movieService.queryMovieById(movieId));
    }
    @PostMapping("/add")
    public ResponseVO insertMovie(@RequestBody MovieVO movieVO){
        return ResponseVO.buildSuccess(movieService.insertMovie(movieVO));
    }
    @GetMapping("/search")
    public ResponseVO searchByKeyWords(@RequestParam String key){
        return ResponseVO.buildSuccess(movieService.searchByKeyWords(key));
    }
    @GetMapping("/updateMovieLike")
    public ResponseVO updateMovieLike(@RequestParam Integer id,@RequestParam Integer change){
        return ResponseVO.buildSuccess(movieService.updateMovieLike(id,change));
    }
}
