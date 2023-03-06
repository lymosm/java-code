package com.servlet;

import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException{

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException{
        System.out.println("do filter in this");
        chain.doFilter(req, res);
    }

    @Override
    public void destroy(){

    }


}
