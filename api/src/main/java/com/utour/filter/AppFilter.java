package com.utour.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 기본 web-filter
 *
 * 1. 요청정보
 * 2. 인증체크
 */
@WebFilter
public class AppFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

    }

}
