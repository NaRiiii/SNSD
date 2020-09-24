package kr.co.soccer.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		String XRequested = request.getHeader("X-Requested-With");

		if (session == null) {
			if (XRequested == null) {
				response.sendError(HttpServletResponse.SC_FORBIDDEN); // 403, 접근 금지.
				return false;
			} else {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED); // 401, 인증 안
				return false;
			}
		}
		if (session.getAttribute("USER_INFO") == null) {
			if (XRequested == null) {
				response.sendRedirect(request.getContextPath() + "/login/login.wow");
				return false;
			} else {
				response.sendError(HttpServletResponse.SC_UNAUTHORIZED); // 401, 인증 안
				return false;
			}
		}
		return true;
	} // preHandle

}
