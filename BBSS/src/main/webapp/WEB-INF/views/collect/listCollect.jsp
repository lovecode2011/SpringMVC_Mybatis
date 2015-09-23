<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>图书列表</title>
<!-- Bootstrap -->
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<c:if test="${collectlist!=NULL}">
			<h1>${user.username}</h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                    	<th>图书编号</th>
                         <th>修改</th>
                          <th>删除</th>
                    </tr>
                </thead>
                <tbody>
                
							<c:forEach var="c" items="${collectlist}" varStatus="clist">
							<tr>
							<td>${c.bookid}</td>
                       	  <td><a href="modifyBook/${b.bookid}">修改</a></td>
                          <td><a href="deleteBookById/${b.bookid}">删除</a></td>
                  	  </tr>
							</c:forEach>
						
                    
                </tbody>
            </table>
</c:if>
	 <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
	
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	 
	
</body>

</html>
