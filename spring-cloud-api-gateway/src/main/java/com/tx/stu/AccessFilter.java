package com.tx.stu;
/*
 * 服务网关过滤器（这里没有给出具体逻辑）
 */

import com.netflix.zuul.ZuulFilter;

public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
