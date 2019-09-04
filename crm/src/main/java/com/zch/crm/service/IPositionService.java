package com.zch.crm.service;



import com.zch.crm.entity.Position;

import java.util.List;
/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
public interface IPositionService {

    int deleteByPrimaryKey(Long id);

    int insert(Position record);

    Position selectByPrimaryKey(Long id);

    List<Position> selectAll(String keyword);

    int updateByPrimaryKey(Position record);
}
