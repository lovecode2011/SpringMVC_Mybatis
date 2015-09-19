<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理页面</title>

<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Font-Awesome/css/font-awesome.min.css">
</head>
<body>
 <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
            <a href="##" class="navbar-brand">BookSales</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="##">后台首页</a></li>
            <li class="dropdown">
                <a href="##" data-toggle="dropdown" class="dropdown-toggle">分类管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="##">添加一级分类</a></li>
                    <li><a href="##">添加二级分类</a></li>
                    <li ><a href="##">添加三级分类</a></li>
                </ul>
            </li>
             <li class="dropdown">
                <a href="##" data-toggle="dropdown" class="dropdown-toggle">用户管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="##">添加用户</a></li>
                    <li><a href="##">删除用户</a></li>
                </ul>
            </li>
            <li class="dropdown">
                <a href="##" data-toggle="dropdown" class="dropdown-toggle">图书管理<span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li><a href="##">添加图书</a></li>
                    <li><a href="##">删除图书</a></li>
                </ul>
            </li>
            <li><a href="##">关于我们</a></li>
        </ul>
         <ul class="nav navbar-nav pull-right">
            <li><a href="##">管理员：${admin.username}</a></li>
        </ul>
    </div>
    
<div class="row">
  
  <div class="col-xs-3 col-md-2">
  <ul class="nav nav-pills nav-stacked" style="max-width: 260px;">
        <li class="active">
            <a href="#">
                <span class="badge pull-right">42</span>图书列表
            </a>
        </li>
        <li><a href="#">用户列表</a></li>
        <li>
            <a href="#">
                <span class="badge pull-right">3</span> 订单列表
            </a>
        </li>
    </ul>
    <br />
  </div>
  <div class="col-xs-15 col-md-10">
  <div class="panel panel-success">
        <div class="panel-heading">图书列表</div>
        <div class="panel-body">
            <table class="table table-bordered">
                <thead>
                    <tr>
                       <th>图书编号</th>
                        <th>图书名称</th>
                        <th>图书作者</th>
                        <th>图书出版社</th>
                        <th>ISBN</th>
                         <th>图书仓库地址</th>
                        <th>图书价格</th>
                        <th>图书库存</th>
                         <th>图书销量</th>
                        <th>图书分类</th>
                         <th>操作</th>
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
                       	 <td>${b.isbn}</td>
                       	 <td>${b.repertory}</td>
                       	 <td>${b.price}</td>
                       	 <td>${b.stock}</td>
                       	 <td>${b.sales}</td>
                       	 <td>${b.bookclassid}</td>
                       	  <td><a href="modifyBook/${b.bookid}" class="btn btn-warning  btn-sm" role="button">修改</a>
                          <a href="deleteBookById/${b.bookid}" class="btn btn-danger  btn-sm" role="button">删除</a></td>
                       	 
                       	 
                  	  </tr>
							</c:forEach>
						</c:if>
                    
                </tbody>
            </table>
        </div>
        <div class="panel-footer">  <a href="listBook" class="btn btn-primary  btn-xs" role="button">查看详情</a></div>
    </div>
  <div class="panel panel-primary">
        <div class="panel-heading">用户列表</div>
        <div class="panel-body">
            <table class="table table-bordered">
                <thead>
                    <tr>
                       <th>用户编号</th>
                        <th>用户名称</th>
                        <th>用户邮箱</th>
                        <th>用户密码</th>
                        <th>收货地址</th>
                         <th>操作</th>
                       
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
                       	 <td>${b.isbn}</td>
                       	 <td>${b.repertory}</td>
                       	 <td>${b.price}</td>
                       	 <td>${b.stock}</td>
                       	 <td>${b.sales}</td>
                       	 <td>${b.bookclassid}</td>
                       	  <td><a href="modifyBook/${b.bookid}" class="btn btn-warning  btn-sm" role="button">修改</a>
                          <a href="deleteBookById/${b.bookid}" class="btn btn-danger  btn-sm" role="button">删除</a></td>
                  	  </tr>
							</c:forEach>
						</c:if>
                </tbody>
            </table>
        </div>
        <div class="panel-footer">  <a href="listBook" class="btn btn-primary  btn-xs" role="button">查看详情</a></div>
    </div>
  </div>
</div>
	<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.validate.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>
</body>
</html>