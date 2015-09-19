<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="zh-CN">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>收货地址列表</title>
<!-- Bootstrap -->
<link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>
			<h1>收货列表</h1>
            <table class="table table-bordered">
                <thead>
                    <tr>
                    	<th>收货地址编号</th>
                        <th>收货人</th>
                        <th>收货人电话</th>
                        <th>收货人地址</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>
                <c:if test="${receiverlist!=NULL}">
							<c:forEach var="r" items="${receiverlist}" >
							<tr>
							<td>${r.receiverid}</td>
                        	<td>${r.receivername}</td>
                       	 <td>${r.receivertel}</td>
                       	 <td>${r.receiveraddress}</td>
                       	 
                       	  <td><a href="modifyReceiver/${r.receiverid}">修改</a>
                          <a href="deleteReceiverById/${r.receiverid}">删除</a></td>
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
