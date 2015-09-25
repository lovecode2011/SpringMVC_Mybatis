<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">	
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/order.css">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/nav.css">
	<link rel="shortcut icon" href="images/Book.ico" type="image/x-icon" />
	<title>订单结算-树塾书署</title>
</head>
<body>
	<header class="top">
		<ul id="menu">
		
		<c:if test="${user.username!=null}">
		<li class="floatLeft"><a href="#" >${user.username}</a></li>
		<li class="floatLeft"><a href="userLogout">注销</a></li>
		</c:if>
		<c:if test="${user.username==null}">
		<li class="floatLeft"><a href="/login" >登录</a></li>
		<li class="floatLeft"><a href="/register" >注册</a></li>
		</c:if>
		    <li class="folatRight"><a href="#">联系我们</a></li>
		    <li class="folatRight"><a href="#">我的订单</a></li>	    
		    <li class="folatRight">
		        <a href="#">个人中心</a>
		        <ul>
		            <li><a href="#">我的收藏</a></li>
		            <li><a href="#">我的积分</a></li>
		            <li><a href="#">收货地址簿</a></li>
		        </ul>
		    </li>
		    <li class="folatRight">
		        <a href="shoppingCart.html">购物车</a>
		        <ul>
		            <li><a href="#">货物1</a></li>
		            <li><a href="#">货物2</a></li>
		            <li><a href="#">货物3</a></li>
		        </ul>
		    </li>
		</ul>
    </header>
<div class="container">
	<div class="row head">
        <div class="col-lg-12">
            <img id="headerLogo" class="col-lg-3"src="<%=request.getContextPath()%>/resources/images/img/logo.png" alt="页面logo图片-树塾书署">
 			<button type="button" class="btn btn-success col-lg-3 folatRight returnBack">
 				<a href="shoppingCart.html">返回修改购物车</a>
 			</button>
        </div>
    </div>

	
	<div class="receive panel panel-success">
		<div class="panel-heading">
    		收货相关信息
    	</div>
		<div class="panel-body">
			<ul>
				<li>收货地址
					<button type="button" class="btn btn-success folatRight" data-toggle="collapse" data-target="#newReceive">
						使用新地址
					</button> 
					<div id="newReceive" class="collapse isCenter">
						<form class="form-horizontal" id="newAddr" action="addReceiver" method="post" data-role="collapsible">		<div class="control-group">
								<label class="control-label">收&nbsp;&nbsp;货&nbsp;&nbsp;人：</label>		
								<input type="hidden" name="userid" value="${user.userid}"/>
								
								<input type="text" tabindex="1" name="receivername"  required autofocus>
							</div>
							
							<%--- 
							<div class="control-group">
								<label class="control-label"> 收货地址：</label>						
								<input type="text" tabindex="2" id="place" required>				
							</div>
							--%>
							
							<div class="control-group" id="city_china" data-url="<%=request.getContextPath()%>/resources/js/cityData.min.js" >
								<label class=" control-label" >收货地址&nbsp;&nbsp;:</label>
								<select class="province cxselect placeShow"  name="province"></select>
         	 					<select class="city cxselect placeShow"  name="city" ></select>
         	 					<select class="area cxselect" disabled="disabled" name="area"></select>
                           </div>
							<div class="control-group">
								<label class="control-label"> 详细地址：</label>
								<input type="text" tabindex="3" id="placeDetail" name="placeDetail" required>
							</div>
							<div class="control-group">
								<label class="control-label"> 邮政编码：</label>
								<input type="text" tabindex="4" name="postalcode" required>
							</div>
							<div class="control-group">
								<label class="control-label"> 联系方式：</label>
								<input type="text" tabindex="5" name="receivertel" required>
							</div>
							<div class="control-group">
								<button type="submit" class="btn btn-success configAddr" >确认收货地址</button>
								<button type="button" class="btn btn-success cancelAddr" data-toggle="collapse" data-target="#newReceive">取消使用新地址</button>
							</div>
						</form>
					</div>			
					
					<div class="receiver">
						<ul>
						<c:forEach var="rl" items="${receiverlist}" varStatus="rlist">
							<li>
								<div>
									<input name="addr" type="radio" value="addr_0">
									<span>${rl.receivername } </span><span>${rl.receiveraddress } </span><span>${rl.receivertel} </span>
								</div>	
							</li>			
						</c:forEach>
						<%-- 
							<li>
								<div>
									<input name="addr" type="radio" value="addr_1">
									<span>收货人2 </span><span>收货地址2 </span><span>联系方式2 </span>
								</div>	
							</li>
							--%>		
						</ul>				
					</div>
				</li>
				<li>支付方式

				<form action="" method="post">
					<input name="pay" type="radio" value="">在线支付
					<input name="pay" type="radio" value="">货到付款
				</form>
				</li>
			</ul>
		</div>	
	</div>

	<div class="shoplist panel panel-success">
		<div class="panel-heading">
      		商品信息
   		</div>
		<div class="panel-body">
			<table class="table">
				<thead>
					<tr>
						<th>商品名称</th>
						<th>所在仓库</th>
						<th>单价</th>
						<th>数量</th>
						<th>小计</th>
					</tr>	
				</thead>		
				<tbody>
					<tr>
						<td>文明之光文明之光文明之光文明之光文明之光</td>
						<td>武汉仓库</td>
						<td>107</td>
						<td>1</td>
						<td>107</td>
					</tr>
					<tr>
						<td>文明之光文明之光</td>
						<td>武汉仓库</td>
						<td>10</td>
						<td>1</td>
						<td>107</td>
					</tr>
				</tbody>
				</tbody>
			</table>
		</div>
		
	</div>
	<div class="wrap">
		<div class="col-lg-9 panel panel-success">
			<div class="panel-body">
				<h1>确认收货地址</h1>
				<span>收货人1 </span><span>收货地址1 </span><span>联系方式1 </span>
			</div>		
		</div>
		<div class="col-lg-3 folatRight panel panel-success">
			<div class="panel-body">
				<p>商品总计：</p>
				<p>运费:</p>
				<p>应付总额（含运费）:</p>
				<button type="submit" class="btn btn-success btn-lg ">提交订单</button>
			</div>		
		</div>
	</div>
</div>

<script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/nav.js"></script>
<script
		src="<%=request.getContextPath()%>/resources/js/jquery.cxselect.min.js"></script>
		
		
		<script>
	$('#global_location').cxSelect({
		  selects: ['country', 'state', 'city', 'region'],
		  nodata: 'none'
		});
	
	$('#city_china').cxSelect({
		  selects: ['province', 'city', 'area'],
		
		});
		$('#receiveraddress').cxSelect({

			selects : [ 'one', 'two', 'three' ],
			nodata : 'none'
		});
	</script>
</body>
</html>