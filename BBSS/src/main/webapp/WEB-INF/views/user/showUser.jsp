<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录后的页面</title>
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
欢迎你：${user.username}
<a href="addReceiver/${user.userid}">添加收货地址</a>

<a href="listUserReceiver/${user.userid}">查看收货地址</a>

<a href="listCart/${user.userid}">查看购物车</a>

<a href="listOrder/${user.userid}">查看订单</a>

<a href="listCollect/${user.userid}">查看收藏</a>

<h1>图书列表</h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                    	<th>图书编号</th>
                        <th>图书名称</th>
                        <th>图书作者</th>
                        <th>图书出版社</th>
                         <th>出版时间</th>
                        <th>ISBN</th>
                        <th>图书图片</th>
                         <th>图书仓库地址</th>
                        <th>图书价格</th>
                        <th>图书库存</th>
                         <th>图书销量</th>
                        <th>图书分类</th>
                        <th>是否推荐</th>
                         <th>图书介绍</th>
                         <th>修改</th>
                          <th>删除</th>
                    </tr>
                </thead>
                <tbody>
                <c:if test="${booklist!=NULL}">
							<c:forEach var="b" items="${booklist.list}" varStatus="blist">
							<tr>
							<td>${b.bookid}</td>
                        	<td>${b.bookname}</td>
                       	 <td>${b.author}</td>
                       	 <td>${b.publish}</td>
                       	 
                       	 <td>${b.publishdate}</td>
                       	 <td>${b.isbn}</td>
                       	 <td><img alt="" src="http://wwhahapic.tunnel.mobi/${b.picture}" width="100px" height="80px"></td>
                       	 <td>${b.repertory}</td>
                       	 <td>${b.price}</td>
                       	 <td>${b.stock}</td>
                       	 <td>${b.sales}</td>
                       	 <td>${b.bookclassid}</td>
                       	 <td>${b.isrecommend}</td>
                       	 <td>${b.intro}</td>
                       	  <td><a href="addBook2Cart/${user.userid}/${b.bookid}">加入购物车</a></td>
                          <td><a href="collectBook/${user.userid}/${b.bookid}">收藏</a></td>
                       	 
                       	 
                  	  </tr>
							</c:forEach>
						</c:if>
                    
                </tbody>
            </table>

	 <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>   
	
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	 
</body>
</html>