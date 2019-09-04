package com.zch.crm.service.impl;


import com.zch.crm.entity.User;
import com.zch.crm.mapper.UserMapper;
import com.zch.crm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    public List<User> selectAll(String keyword1, String keyword2) {
        return mapper.selectAll(keyword1,keyword2);
    }

    public List<User> selectPageResult(int page, int pageLimit) {
        return mapper.selectPageResult(page, pageLimit);
    }

    public int insert(User record) {
        return mapper.insert(record);
    }

    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public User selectByLogin(String loginname, String password) {
        return mapper.selectByLogin(loginname, password);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }
}
