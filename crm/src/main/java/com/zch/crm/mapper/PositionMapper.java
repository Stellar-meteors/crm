package com.zch.crm.mapper;

import com.zch.crm.entity.Position;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:25
 * @version:1.0.0
 */
public interface PositionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Position record);

    Position selectByPrimaryKey(Long id);

    List<Position> selectAll(@Param("keyword") String keyword);

    int updateByPrimaryKey(Position record);
}
