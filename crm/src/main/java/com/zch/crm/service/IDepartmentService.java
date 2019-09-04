package com.zch.crm.service;

import com.zch.crm.entity.Department;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:26
 * @version:1.0.0
 */
public interface IDepartmentService {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    Department selectByPrimaryKey(Long id);

    List<Department> selectAll(String keyword);

    int updateByPrimaryKey(Department record);
}
