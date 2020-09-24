<%@page import="kr.co.soccer.common.util.CookieUtils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html >
<html>
<head>
<meta charset=UTF-8">
<%@ include file="/WEB-INF/inc/header.jsp"%>
<title>Insert title here</title>
</head>
<body>
<%
	String msg = request.getParameter("msg");
	String name = "";
	String s_checked = "";
	//String cookie = request.getHeader("Cookie"); //쿠키 헤어정보 가져오기
	CookieUtils cookieUtils = new CookieUtils(request);
	/* if(cookie !=null){ */
	if(cookieUtils.getValue("SAVE_ID") !=null){
		Cookie[] cookies = request.getCookies();
		for(int i=0; i<cookies.length;i++){
			if(cookies[i].getName().equals("SAVE_ID")){
				name = cookies[i].getValue();
				s_checked ="checked=checked";
			}
		}
	}
%>
	<%@ include file ="/WEB-INF/inc/top.jsp" %>
	<div class="container">
		<form action="login.wow" method="post" class="loginForm">
			<h2>로그인</h2>
			<table class="table table-bordered">
				<tbody>
					<tr>
						<th>아이디</th>
						<!-- 여기 오류나서 잠깐 주석처리 -->
						<%-- <td><input type="text" name="userId" class="form-control input-sm" value="<%=name%>"></td> --%>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" name="userPass" class="form-control input-sm"></td>
					</tr>
					<tr>
						<td colspan="2">
						<!-- 여기 오류나서 잠깐 주석처리 -->
						<%-- <label><input type="checkbox" name="rememberMe" value="Y" <%=s_checked%>> ID 기억하기</label></td> --%>
					</tr>
					<tr>
						<td colspan="2">
							<button type="submit" class="btn btn-primary btn-sm pull-right">로그인</button>
						</td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
	<!-- container -->
</body>
</html>