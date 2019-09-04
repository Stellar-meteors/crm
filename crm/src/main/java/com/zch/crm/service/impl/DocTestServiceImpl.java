package com.zch.crm.service.impl;


import com.zch.crm.entity.DocTest;
import com.zch.crm.mapper.DocTestMapper;
import com.zch.crm.service.IDocTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 类描述信息 部门业务处理类
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
@Service
public class DocTestServiceImpl implements IDocTestService {
    @Autowired
    private DocTestMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DocTest record) {
        return mapper.insert(record);
    }

    @Override
    public DocTest selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DocTest> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(DocTest record) {
        return mapper.updateByPrimaryKey(record);
    }
}
