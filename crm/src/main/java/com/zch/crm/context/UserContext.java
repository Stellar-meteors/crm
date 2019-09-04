package com.zch.crm.context;

import com.zch.crm.entity.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * @Description: 类描述信息   存储用户登入的Session
 * @Author: 张楚涵
 * @Date: 2019/9/4 0004 9:20
 * @version:1.0.0
 */
public class UserContext {

    public static final String USER_IN_SESSION = "user_in_session";

    //获取session对象
    private static HttpSession getSession() {

        return ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest().getSession();
    }

    //设置用户登入的Session
    public static void setUserInSession(User contextUser) {
        if (contextUser != null) {
            //保存session
            getSession().setAttribute(USER_IN_SESSION, contextUser);
        } else {
            //注销session
            getSession().invalidate();
        }
    }

    //共享给外部调用登入session
    public static User getCurrentUser() {
        return (User) getSession().getAttribute(USER_IN_SESSION);
    }
}
