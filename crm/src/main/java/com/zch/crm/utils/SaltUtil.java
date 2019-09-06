package com.zch.crm.utils;

import java.util.UUID;

/**
 * @Description: 盐值工具生成
 * @Author: 张楚涵
 * @Date: 2019/9/5 0005 9:05
 * @version:1.0.0
 */
public class SaltUtil {

    public static String getSalt() {
        // 创建盐值
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }
}
