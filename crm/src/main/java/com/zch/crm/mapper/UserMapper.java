package com.zch.crm.mapper;

import com.zch.crm.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:26
 * @version:1.0.0
 */
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    User selectByLogin(@Param("loginname") String loginname, @Param("password") String password);

    List<User> selectAll(@Param("keyword1") String keyword1, @Param("keyword2") String keyword2);

    int updateByPrimaryKey(User record);


    List<User> selectPageResult(@Param("page") int page, @Param("pageLimit") int pageLimit);

    //通过用户登录名得到盐值
    User selectSaltByName(String loginname);

    int selectCountByLoginname(String loginname);
}
