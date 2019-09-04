package com.zch.crm.utils;

/**
 * @Description: 方法功能描述 判断非空
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:38
 * @version:1.0.0
 */
public class StringUtils {

    public static boolean hasLength(String str) {
        return str != null && !"".equals(str.trim());
    }
}
