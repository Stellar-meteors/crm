package com.zch.crm.mapper;

import com.zch.crm.entity.DocTest;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:24
 * @version:1.0.0
 */
public interface DocTestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DocTest record);

    DocTest selectByPrimaryKey(Long id);

    List<DocTest> selectAll();

    int updateByPrimaryKey(DocTest record);
}
