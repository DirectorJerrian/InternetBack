package com.netdevelop.demo.po;

public class Movie {
//电影：id（int），名字（string），上映时间（datetime），描述（string），类型；

    //主键ID
    private Integer id;
    //电影名称
    private String movieName;
    //上映时间
    private String releaseTime;

    //多少人想看/点赞
    private Integer likes;

    //编剧
    private String writer;

    //电影描述
    private String description;
    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription(){
        return this.description;
    }
    /*
       1，2，3分别对应热门，热映，榜单
     */
    private Integer type;

    //电影导演名字
    private String director;
    //电影主演名字
    private String actors;
    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }



    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    //电影图像url
    private String imgUrl;
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    //电影评分
    private double score;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Integer getType(){
        return this.type;
    }
    public void setType(Integer type){
        this.type=type;
    }
}
