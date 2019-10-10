package com.sys.eblog.base.handlers;

import com.sys.eblog.common.exceptions.NoLoginException;
import com.sys.eblog.common.exceptions.ParamsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;
@Slf4j
public class AuthorityInterceptor implements HandlerInterceptor {
    //拦截登录
    private static final Set<String> INTERCEPT_URI = new HashSet<>();//拦截的URI

    static {
        INTERCEPT_URI.add("/user/login.html");
        INTERCEPT_URI.add("/user/login");
    }

    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object object) throws Exception {
        String uri = request.getRequestURI();
       // log.info("拦截" + uri);
        HttpSession session = request.getSession();
        System.out.println("preHandle");
        if(uri.contains("hello"))
          throw new NoLoginException("请先登录！");
        else
            return true ;
        //return true;
    }

    /**
     * 请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView mv) throws Exception {
        System.out.println("postHandle");

    }

    /**
     * 在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行
     * （主要是用于进行资源清理工作）
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
