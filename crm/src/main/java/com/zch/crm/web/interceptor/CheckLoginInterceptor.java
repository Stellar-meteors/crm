package com.zch.crm.web.interceptor;

import com.zch.crm.context.UserContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 类描述信息 登入拦截器
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:38
 * @version:1.0.0
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断用户是否登入
        if (UserContext.getCurrentUser() == null) {
            response.sendRedirect("login.jsp");
            System.out.println("CheckLoginInterceptor.preHandle" + "----------------未登入------拦截请求--------------->");
            return false;
        }
        return true;
    }
}
