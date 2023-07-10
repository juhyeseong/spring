package com.itbank.interceptor;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("login") != null) {
			return true;
		}
		String requestURL = request.getRequestURL().toString();
		String contextPath = request.getContextPath();
		
		requestURL = requestURL.substring(requestURL.indexOf(contextPath) + contextPath.length());
		requestURL = URLEncoder.encode(requestURL, "UTF-8");
		response.sendRedirect(contextPath + "/member/login?url=" + requestURL);
		
		return false;
	}
}
