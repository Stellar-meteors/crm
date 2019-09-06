package com.zch.crm.service.impl;


import com.zch.crm.entity.User;
import com.zch.crm.mapper.UserMapper;
import com.zch.crm.service.IUserService;
import com.zch.crm.utils.MD5Utils;
import com.zch.crm.utils.SaltUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> selectAll(String keyword1, String keyword2) {
        return mapper.selectAll(keyword1,keyword2);
    }

    @Override
    public List<User> selectPageResult(int page, int pageLimit) {
        return mapper.selectPageResult(page, pageLimit);
    }

    @Override
    public int insert(User user) {
        // 得到盐值
        String salt = SaltUtil.getSalt();
        String pwd = MD5Utils.md5(salt + user.getPassword());
        user.setSalt(salt);
        user.setPassword(pwd);
        return mapper.insert(user);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public User selectByLogin(String loginname, String password) {
        User user=mapper.selectSaltByName(loginname);
        String salt=user.getSalt();
        String pwd=MD5Utils.md5(salt+password);
        return mapper.selectByLogin(loginname, pwd);
    }

    @Override
    public int updateByPrimaryKey(User user) {
        // 得到盐值
        String salt = SaltUtil.getSalt();
        //加密后的密码
        String pwd = MD5Utils.md5(salt + user.getPassword());
        user.setSalt(salt);
        user.setPassword(pwd);
        return mapper.updateByPrimaryKey(user);
    }
}
