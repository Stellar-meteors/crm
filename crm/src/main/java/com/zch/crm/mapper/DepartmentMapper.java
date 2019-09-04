package com.zch.crm.mapper;

import com.zch.crm.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:24
 * @version:1.0.0
 */
public interface DepartmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    Department selectByPrimaryKey(Long id);

    List<Department> selectAll(@Param("keyword") String keyword);

    int updateByPrimaryKey(Department record);
}
