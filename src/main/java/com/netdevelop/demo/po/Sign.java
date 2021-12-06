package com.netdevelop.demo.po;

public class Sign {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 进行签到用户id
     */
    private Integer userId;

    /**
     * 签到时间的年份
     */
    private Integer sYear;
    /**
     * 签到时间的月份
      */
    private Integer sMonth;

    /**
     * 签到时间的天
     */
    private Integer sDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getsYear() {
        return sYear;
    }

    public void setsYear(Integer sYear) {
        this.sYear = sYear;
    }

    public Integer getsMonth() {
        return sMonth;
    }

    public void setsMonth(Integer sMonth) {
        this.sMonth = sMonth;
    }

    public Integer getsDay() {
        return sDay;
    }

    public void setsDay(Integer sDay) {
        this.sDay = sDay;
    }
}
