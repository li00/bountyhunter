package com.bountyhunter.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
@WebFilter(urlPatterns = "/*")
public class FilterManage implements Filter{

    @Value("${security.url}")
    private String[] securityUrl;

    @Autowired
    private Security security;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        String url = httpServletRequest.getServletPath();
        String key = httpServletRequest.getParameter("k");
        boolean valid = false; //不要要验证
        if (key != null && !"".equals(key.trim())){
            for (String s:securityUrl){
                if(url.indexOf(s) != -1){//需要验证身份的操作, 验证key
                    valid = true;
                }
            }
            if (valid){//需要验证
                String parseKey = security.parseCertificate(key);
                if(parseKey.length()>13){
                    long l = Integer.parseInt((parseKey.substring(0,13)));
                    if( l > System.currentTimeMillis() ){
                        chain.doFilter(request,response);
                    }else{
                        response.getOutputStream().write("{\"state\":true,\"msg\":\"请登录\"}".getBytes());
                    }
                }
            } else {//默认key可以放行，这些操作不需要认证的
                chain.doFilter(request,response);
            }
        }
    }

    @Override
    public void destroy() {}
}
