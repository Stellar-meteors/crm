package com.zch.crm.service.impl;


import com.zch.crm.entity.Employee;
import com.zch.crm.mapper.EmployeeMapper;
import com.zch.crm.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 类描述信息 员工业务层
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    //注入mapper
    @Autowired
    private EmployeeMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Employee record) {
        if (record != null) {
            return mapper.insert(record);
        }
        return 0;

    }

    @Override
    public Employee selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Employee> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Employee record) {
        return mapper.updateByPrimaryKey(record);
    }
}
