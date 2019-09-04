package com.zch.crm.service;


import com.zch.crm.entity.DownloadDco;

import java.util.List;

/**
 * @Description: TODO
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:27
 * @version:1.0.0
 */
public interface IDownloadService {

    int deleteByPrimaryKey(Long id);

    int insert(DownloadDco record);

    DownloadDco selectByPrimaryKey(Long id);

    List<DownloadDco> selectAll();

    int updateByPrimaryKey(DownloadDco record);
}
