package com.wyett.binlogFilter.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author : wyettLei
 * @date : Created in 2020/7/3 11:44
 * @description: TODO
 */

public class BinlogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("binlog filter...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
