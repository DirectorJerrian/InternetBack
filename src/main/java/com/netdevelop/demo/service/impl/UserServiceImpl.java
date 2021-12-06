package com.netdevelop.demo.service.impl;

import com.netdevelop.demo.dao.UserDao;
import com.netdevelop.demo.po.User;
import com.netdevelop.demo.service.UserService;
import com.netdevelop.demo.utils.HttpUtil;
import com.netdevelop.demo.vo.ResponseVO;
import com.netdevelop.demo.vo.UserVO;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Value("${app_id}")
    private  String appId;
    @Value("${app_secret}")
    private  String appSecret;
    @Autowired
    private UserDao userDao;
    @Override
    public User queryUserByUserId(int userId) {
        return userDao.queryUserByUserId(userId);
    }

    @Override
    public ResponseVO login(UserVO userVO) {
        String result="";
        String code=userVO.getCode();
        try{//请求微信服务器，用code换取openid。
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + appId + "&secret="
                            + appSecret + "&js_code="
                            + code
                            + "&grant_type=authorization_code", null);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        JSONObject jsonObj = JSONObject.fromObject(result);
        System.out.println("用户的openid为："+jsonObj.get("openid"));
        String openId=jsonObj.get("openid").toString();
        String sessionKey=jsonObj.get("session_key").toString();
        User user1=userDao.registerUser(openId);//去数据库判断用户是否存在该用户
        if(user1!=null)//如果存在该用户
        {
            return ResponseVO.buildSuccess(userDao.queryUserByUserId(user1.getId()));
        }
        //如果是新用户，就添加用户到数据库中
        User user=new User();
        user.setUserName(userVO.getUserName());
        user.setUserImg(userVO.getUserImg());
        user.setOpenId(openId);
        user.setSessionKey(sessionKey);
        int userId=userDao.insertUser(user);
        return ResponseVO.buildSuccess(userDao.queryUserByUserId(userId));
    }

    @Override
    public ResponseVO updateUserInfo(Integer id, String userName, String userImg) {
        userDao.updateInfo(id,userName,userImg);
        return ResponseVO.buildSuccess(userDao.queryUserByUserId(id));
    }



}
