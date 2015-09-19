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
							<c:forEach var="b" items="${booklist}" varStatus="blist">
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
                       	  <td><a href="modifyBook/${b.bookid}">修改</a></td>
                          <td><a href="deleteBookById/${b.bookid}">删除</a></td>
                       	 
                       	 
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
