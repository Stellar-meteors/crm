package com.zch.crm.mapper;

import com.zch.crm.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/5 0005 9:29
 * @version:1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class mapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = userMapper.selectSaltByName("zch");
        System.out.println("获得的盐值是******************" + user.getSalt());
    }

    @Test
    public void loginName() {
        int r = userMapper.selectCountByLoginname("zch");
        System.out.println("*****************" + r);
    }
}
