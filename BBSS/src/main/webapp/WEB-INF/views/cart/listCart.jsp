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
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
	<c:if test="${cartlist!=NULL}">
			<h1>${ user.username}</h1>
			 <form  action="${pageContext.request.contextPath }/${user.userid }/addOrder" method="post" class="form-horizontal">
            <table class="table table-bordered">
            <input type="hidden" name ="userid" value="${user.userid }"/>
                <thead>
                    <tr>
                    <th>选择</th>
                    	<th>图书编号</th>
                        <th>图书名称</th>
                        <th>图书数量</th>
                        <th>小计</th>
                         <th>修改</th>
                          <th>删除</th>
                    </tr>
                </thead>
                <tbody>
              
							<c:forEach var="c" items="${cartlist}" varStatus="clist">
							<tr>
							<td><input type="checkbox" name="book_id" value="${c.bookid }"/></td>
							<td>${c.bookid}</td>
                        	<td>${c.bookname}</td>
                       	 <td>${c.booknum}</td>
                       	 <td>${c.amount}</td>
                       	 
                       	  <td><a href="modifyBook/${b.bookid}">修改</a></td>
                          <td><a href="deleteBookById/${b.bookid}">删除</a></td>
                       	 
                       	 
                  	  </tr>
							</c:forEach>
                    
                </tbody>
                <tfoot>
              <input type="submit" value="提交2"/>
                
                </tfoot>
            </table>
            </form>
</c:if>
	 <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>   
	
	<script
		src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
	 
	
</body>

</html>
