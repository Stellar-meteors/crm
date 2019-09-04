package com.zch.crm.service.impl;


import com.zch.crm.entity.Department;
import com.zch.crm.mapper.DepartmentMapper;
import com.zch.crm.service.IDepartmentService;
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
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Department record) {
        return departmentMapper.insert(record);
    }

    @Override
    public Department selectByPrimaryKey(Long id) {
        return departmentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Department> selectAll(String keyword) {
        return departmentMapper.selectAll(keyword);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        return departmentMapper.updateByPrimaryKey(record);
    }
}
