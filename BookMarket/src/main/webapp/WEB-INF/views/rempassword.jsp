<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>jsp 利用cookie 记住用户名和密码</title>
</head>
<%
	if (request.getParameter("rember") != null) {
		//记住密码一般不把密码直接保存到cookie中，可以把用户ID值保存到cookie中
		Cookie cookie = new Cookie("userName", request.getParameter("userName"));
		cookie.setMaxAge(360 * 24 * 60 * 60);
		response.addCookie(cookie);
	}
	Cookie cookies[] = request.getCookies();
	try {
		out.println(cookies.length);
		for (int i = 0; i < cookies.length; i++) {
			out.println(cookies[i].getName() + ":" + cookies[i].getValue());
		}
	} catch (Exception e) {
		out.println("您上次未记住密码");
	}
%>
<body>
	<form id="remberPassword_form" name="remberPassword" method="post"
		action="">
		<table>
			<tr>
				<th>用户名:</th>
				<td><input name="userName" /></td>
			</tr>
			<tr>
				<th>密码:</th>
				<td><input name="password" type="password" /></td>
			</tr>
			<tr>
				<th>记住密码</th>
				<td><input type="checkbox" name="rember" /> <input
					type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
