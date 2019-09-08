package com.zch.crm.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Description: md5 加密工具类
 * @Author: 张楚涵
 * @Date: 2019/9/5 0005 9:02
 * @version:1.0.0
 */
public class MD5Utils {
    public static String md5(String instr) {
        return DigestUtils.md5Hex(instr);
    }

    public static void main(String[] args) {
        String pwd=md5("10ca97908bca4efdaef93901d79862e5"+123456);
        System.out.println("*******************"+pwd);
    }
}
