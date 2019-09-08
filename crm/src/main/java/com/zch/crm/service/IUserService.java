package com.zch.crm.service;



import com.zch.crm.entity.User;

import java.util.List;
/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
public interface IUserService {

    List<User> selectAll(String keyword1, String keyword2);
    List<User> selectPageResult(int page, int pageLimit);
    int insert(User record);
    int deleteByPrimaryKey(Long id);
    User selectByLogin(String loginname, String password);
    int updateByPrimaryKey(User record);

    int selectCountByLoginname(String loginname);
}
