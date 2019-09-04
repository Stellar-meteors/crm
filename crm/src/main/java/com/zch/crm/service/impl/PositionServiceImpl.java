package com.zch.crm.service.impl;


import com.zch.crm.entity.Position;
import com.zch.crm.mapper.PositionMapper;
import com.zch.crm.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 类描述信息 职位部门管理Controller
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
@Service
public class PositionServiceImpl implements IPositionService {


    //注入Mapper
    @Autowired
    private PositionMapper mapper;

    @Override
    public int deleteByPrimaryKey(Long id) {

        if (!(id == 0 && id == null)) {
            int pid = mapper.deleteByPrimaryKey(id);
            return pid;
        }
        return 0;
    }

    @Override
    public int insert(Position record) {
        if (record != null) {
            return mapper.insert(record);
        }
        return 0;

    }

    @Override
    public Position selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Position> selectAll(String keyword) {
        return mapper.selectAll(keyword);
    }

    @Override
    public int updateByPrimaryKey(Position record) {
        return mapper.updateByPrimaryKey(record);
    }
}
