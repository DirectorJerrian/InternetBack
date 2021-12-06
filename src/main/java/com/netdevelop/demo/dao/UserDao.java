package com.netdevelop.demo.dao;

import com.netdevelop.demo.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 根据用户Id返回该用户信息
     * @param id
     * @return
     */
    User queryUserByUserId(@Param("id") int id);

    /**
     * 添加新的用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 根据openId判断用户是否注册，若注册则返回；
     * @param openId
     * @return
     */
    User registerUser(@Param("openId") String openId);

    /**
     *更新信息
     * @param
     * @return
     */
    int updateInfo(@Param("id") Integer id,@Param("userName") String userName,@Param("userImg") String userImg);

}
