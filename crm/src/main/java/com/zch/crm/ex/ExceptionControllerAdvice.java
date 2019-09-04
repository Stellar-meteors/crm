package com.zch.crm.ex;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 类描述信息 统一异常处理器
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:23
 * @version:1.0.0
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String errorView(Exception ex) {

        return "出现异常了" + ex.getMessage();
    }
}
