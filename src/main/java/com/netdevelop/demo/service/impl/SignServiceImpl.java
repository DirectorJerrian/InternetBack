package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.SignDao;
import com.netdevelop.demo.po.Sign;
import com.netdevelop.demo.service.SignService;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.SignVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignDao signDao;

    @Override
    public ResponseVO insertSign(SignVO signVO) {
        Integer year=Integer.parseInt(signVO.getDate().substring(0,4));
        Integer month=Integer.parseInt(signVO.getDate().substring(5,7));
        Integer day=Integer.parseInt(signVO.getDate().substring(8));
        Sign sign=signDao.querySign(signVO.getUserId(),year,month,day);
        if(null==sign){
            Sign curSign=new Sign();
            curSign.setUserId(signVO.getUserId());
            curSign.setsYear(year);
            curSign.setsMonth(month);
            curSign.setsDay(day);
            int effectNum=signDao.insertSign(curSign);
            if(effectNum>0){
                return ResponseVO.buildSuccess("签到成功");
            }else{
                return ResponseVO.buildFailure("签到失败");
            }
        }else{
            return ResponseVO.buildSuccess("今天已签到！");
        }
    }

    @Override
    public List<Sign> getUserSigns(Integer userId) {
        return signDao.selectSignByUserId(userId);
    }
}
