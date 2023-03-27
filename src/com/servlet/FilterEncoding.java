package com.servlet;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FilterEncoding implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //初始化
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
          //具体执行方法
        //1强转：
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        //2.设置编码格式
        System.out.println("进行编码");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //3.继续往下执行过滤器链(重新调用本方法）
        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
